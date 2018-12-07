package com.example.michaelvillalobos.course_project;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;


public class GridAdapter extends BaseAdapter {
    int[] values;
    private int[] images;
    private Context mContext;
    View view;

    private int[][] board;
    private int playerID;
    // ----------------------------------------
    // Each board position will hold an int to
    // denote what is there. They are:
    // 0 - Nothing
    // 1 - Red (Player 1)
    // 2 - Black (Player 2)

    public GridAdapter(Context mContext, int[] values, int[] images) {
        this.mContext = mContext;
        this.values = values;
        this.images = images;
        board = new int[6][7];
        for(int i = 0; i < 6; i++) {
            for(int j = 0; j < 7; j++) {
                board[i][j] = 0;
            }
        }
        playerID = 0;
    }

    @Override
    public int getCount() {
        return values.length;
    }

    @Override
    public Object getItem(int position) {
        return values[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater)
                mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View tile;
        if (convertView == null) {
            tile = inflater.inflate(R.layout.tile, null);
            ImageView imageView = (ImageView)
                    tile.findViewById(R.id.tile_image);
            imageView.setImageResource(images[0]);
            tile.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Boolean moveHere = false;
                    int i = 0;
                    int pos = position;
                    while (pos > 6) {
                        i += 1;
                        pos = pos - 7;
                    }
                    if (i != 5) {
                        if(board[i + 1][pos] != 0) {
                            moveHere = true;
                        }
                    } else {
                        moveHere = true;
                    }
                    if (moveHere) {
                        v.setClickable(false);
                        ImageView imageView = v.findViewById(R.id.tile_image);
                        if (playerID == 0) {
                            imageView.setImageResource(Connect4_PVP.images[1]);
                            board[i][pos] = 1;
                            if (maxInLine(i, pos) >= 4) {
                                Toast.makeText(mContext, "Game Over", Toast.LENGTH_SHORT).show();
                            }
                            playerID = 1;
                        } else {
                            imageView.setImageResource(Connect4_PVP.images[2]);
                            board[i][pos] = 2;
                            if (maxInLine(i, pos) >= 4) {
                                Toast.makeText(mContext, "Game Over", Toast.LENGTH_SHORT).show();
                            }
                            playerID = 0;
                        }
                    } else {
                        Toast.makeText(mContext, "These things don't float!", Toast.LENGTH_SHORT).show();
                    }
                }
            });
        } else {
            tile = (View) convertView;
        }
        return tile;
    }

    private int maxInLine(int moveX, int moveY) {
        int playerMove = board[moveX][moveY];
        int maxInLine = 0;

        int numInLine = 0;
        for (int i = 0; i < 6; i++) {
            if (board[i][moveY] == playerMove) {
                numInLine += 1;
            } else {
                numInLine = 0;
            }
            if (numInLine > maxInLine) {
                maxInLine = numInLine;
            }
        }

        numInLine = 0;
        for (int i = 0; i < 7; i++) {
            if (board[moveX][i] == playerMove) {
                numInLine += 1;
            } else {
                numInLine = 0;
            }
            if (numInLine > maxInLine) {
                maxInLine = numInLine;
            }
        }

        for (int i = 0; i < 3; i++) {
            numInLine = 0;
            int ii, j;
            for (ii = i, j = 0; ii < 6 && j < 7; ii++, j++) {
                if (board[ii][j] == playerMove) {
                    numInLine += 1;
                } else {
                    numInLine = 0;
                }
                if (numInLine > maxInLine) {
                    maxInLine = numInLine;
                }
            }
        }
        for (int j = 1; j < 4; j++) {
            numInLine = 0;
            int i, jj;
            for (i = 0, jj = j; i < 6 && jj < 7; i++, jj++) {
                if (board[i][jj] == playerMove) {
                    numInLine += 1;
                } else {
                    numInLine = 0;
                }
                if (numInLine > maxInLine) {
                    maxInLine = numInLine;
                }
            }
        }

        for (int i = 0; i < 3; i++) {
            numInLine = 0;
            int ii, j;
            for (ii = i, j = 6; ii < 6 && j >= 0; ii++, j--) {
                if (board[ii][j] == playerMove) {
                    numInLine += 1;
                } else {
                    numInLine = 0;
                }
                if (numInLine > maxInLine) {
                    maxInLine = numInLine;
                }
            }
        }
        for (int j = 5; j > 2; j--) {
            numInLine = 0;
            int i, jj;
            for (i = 0, jj = j; i < 6 && jj >= 0; i++, jj--) {
                if (board[i][jj] == playerMove) {
                    numInLine += 1;
                } else {
                    numInLine = 0;
                }
                if (numInLine > maxInLine) {
                    maxInLine = numInLine;
                }
            }
        }

        return maxInLine;
    }
}

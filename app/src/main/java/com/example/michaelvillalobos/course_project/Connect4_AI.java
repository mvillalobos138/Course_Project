package com.example.michaelvillalobos.course_project;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.GridView;
import android.widget.TextView;

import java.util.Random;

public class Connect4_AI extends AppCompatActivity {
    GridView gridView;
    GridAdapter adapter;
    View view;
    static int player = 0;
    static int p1S = 0;
    static int p2S = 0;

    static int computerI;
    static int computerY;

    static int[] array_stuff = {
            0, 0, 0, 0, 0, 0, 0,
            0, 0, 0, 0, 0, 0, 0,
            0, 0, 0, 0, 0, 0, 0,
            0, 0, 0, 0, 0, 0, 0,
            0, 0, 0, 0, 0, 0, 0,
            0, 0, 0, 0, 0, 0, 0
    };

    static int[] images = {
            R.drawable.empty_tile,
            R.drawable.red_tile,
            R.drawable.black_tile
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cnect4__pvp);

        gridView = (GridView) findViewById(R.id.grid_view);
        adapter = new GridAdapter(this, array_stuff, images, gridView, adapter);
        gridView.setAdapter(adapter);
    }

    public void connect4PlayAgain(View v) {
        array_stuff = new int[] {
                0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0
        };
        Connect4_Menu.gameover = false;
        adapter = new GridAdapter(this, array_stuff, images, gridView, adapter);
        gridView.setAdapter(adapter);
        TextView winner = findViewById(R.id.textView11);
        TextView p1Score = findViewById(R.id.textView12);
        TextView p2Score = findViewById(R.id.textView13);
        if(player == 1)
            winner.setText("Player 1 is the winner!");
        else
            winner.setText("Player 2 is the winner!");
        p1Score.setText("Player 1 Score: " + p1S);
        p2Score.setText("Player 2 Score: " + p2S);
    }

    public static void Update(int[] values) {
        array_stuff = values;
    }

    public static void Move(Context mContext, GridView gridView, GridAdapter adapter, int[] values) {
        array_stuff = values;
        int[][] newBoard = computer_make_move(GridAdapter.board);
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                array_stuff[i * 7 + j] = newBoard[i][j];
                GridAdapter.board[i][j] = newBoard[i][j];
            }
        }
        adapter = new GridAdapter(mContext, array_stuff, images, gridView, adapter);
        gridView.setAdapter(adapter);
    }

    static private int[][] computer_make_move(int[][] current_board){
        int row = 7;
        int column = 6;
        int count = 42;


        int[][] move_1 = new int[6][7];
        int[][] move_2 = new int[6][7];
        int[][] move_3 = new int[6][7];
        int[][] move_4 = new int[6][7];
        int[][] move_5 = new int[6][7];
        int[][] move_6 = new int[6][7];
        int[][] move_7 = new int[6][7];

        int c_1 = 0;
        int r_1 = 0;

        int c_2 = 0;
        int r_2 = 0;

        int c_3 = 0;
        int r_3 = 0;

        int c_4 = 0;
        int r_4 = 0;

        int c_5 = 0;
        int r_5 = 0;

        int c_6 = 0;
        int r_6 = 0;

        int c_7 = 0;
        int r_7 = 0;



        //COPY ALL OF THE ARRAYS MOVES ____________________________________________________________________
        for (int c = 0; c < 6; c++) {
            for(int r = 0; r < 7; r++) {
                move_1[c][r] = current_board[c][r];
            }
        }

        for (int c = 0; c < 6; c++) {
            for(int r = 0; r < 7; r++) {
                move_2[c][r] = current_board[c][r];
            }
        }
        for (int c = 0; c < 6; c++) {
            for(int r = 0; r < 7; r++) {
                move_3[c][r] = current_board[c][r];
            }
        }
        for (int c = 0; c < 6; c++) {
            for(int r = 0; r < 7; r++) {
                move_4[c][r] = current_board[c][r];
            }
        }
        for (int c = 0; c < 6; c++) {
            for(int r = 0; r < 7; r++) {
                move_5[c][r] = current_board[c][r];
            }
        }
        for (int c = 0; c < 6; c++) {
            for(int r = 0; r < 7; r++) {
                move_6[c][r] = current_board[c][r];
            }
        }
        for (int c = 0; c < 6; c++) {
            for(int r = 0; r < 7; r++) {
                move_7[c][r] = current_board[c][r];
            }
        }


        //CHECK EACH VALID MOVES __________________________________________________________________

        for(int move = 5; move >= 0; move--){

            if(move_1[move][0] == 0){
                move_1[move][0] = 2;
                c_1 = move;
                r_1 = 0;
                break;
            }

        }



        for(int move1 = 5; move1 >= 0; move1--){

            if(move_2[move1][1] == 0){
                move_2[move1][1] = 2;
                c_2 = move1;
                r_2 = 1;
                break;
            }

        }


        for(int move2 = 5; move2 >= 0; move2--){

            if(move_3[move2][2] == 0){
                move_3[move2][2] = 2;
                c_3 = move2;
                r_3 = 2;
                break;
            }

        }


        for(int move = 5; move >= 0; move--){

            if(move_4[move][3] == 0){
                move_4[move][3] = 2;
                c_4 = move;
                r_4 = 3;
                break;
            }

        }


        for(int move = 5; move >= 0; move--){

            if(move_5[move][4] == 0){
                move_5[move][4] = 2;
                c_5 = move;
                r_5 = 4;
                break;
            }

        }


        for(int move = 5; move >= 0; move--){

            if(move_6[move][5] == 0){
                move_6[move][5] = 2;
                c_6 = move;
                r_6 = 5;
                break;
            }

        }

        for(int move = 5; move >= 0; move--){

            if(move_7[move][6] == 0){
                move_7[move][6] = 2;
                c_7 = move;
                r_7 = 6;
                break;
            }

        }

        int max1 = GridAdapter.maxInLine(c_1, r_1, move_1);
        int max2 = GridAdapter.maxInLine(c_2, r_2, move_2);
        int max3 = GridAdapter.maxInLine(c_3, r_3, move_3);
        int max4 = GridAdapter.maxInLine(c_4, r_4, move_4);
        int max5 = GridAdapter.maxInLine(c_5, r_5, move_5);
        int max6 = GridAdapter.maxInLine(c_6, r_6, move_6);
        int max7 = GridAdapter.maxInLine(c_7, r_7, move_7);

        int[] array = {max1, max2, max3, max4, max5, max6, max7};

        int winAt = -1;

        for (int i = 0; i < array.length; i++) {
            winAt = array[i] > 3 ? i : winAt;
        }

        int num;
        if (winAt != -1) {
            winAt++;
            num = winAt;
        } else {
            move_1[c_1][r_1] = 1;
            move_2[c_2][r_2] = 1;
            move_3[c_3][r_3] = 1;
            move_4[c_4][r_4] = 1;
            move_5[c_5][r_5] = 1;
            move_6[c_6][r_6] = 1;
            move_7[c_7][r_7] = 1;

            max1 = GridAdapter.maxInLine(c_1, r_1, move_1);
            max2 = GridAdapter.maxInLine(c_2, r_2, move_2);
            max3 = GridAdapter.maxInLine(c_3, r_3, move_3);
            max4 = GridAdapter.maxInLine(c_4, r_4, move_4);
            max5 = GridAdapter.maxInLine(c_5, r_5, move_5);
            max6 = GridAdapter.maxInLine(c_6, r_6, move_6);
            max7 = GridAdapter.maxInLine(c_7, r_7, move_7);

            array[0] = max1;
            array[1] = max2;
            array[2] = max3;
            array[3] = max4;
            array[4] = max5;
            array[5] = max6;
            array[6] = max7;

            for (int i = 0; i < array.length; i++) {
                winAt = array[i] > 3 ? i : winAt;
            }
            if (winAt != -1) {
                winAt++;
                num = winAt;
            } else {
                for (int i = 0; i < array.length; i++) {
                    winAt = array[i] > 2 ? i : winAt;
                }
                if (winAt != -1) {
                    winAt++;
                    num = winAt;
                } else {
                    Random random = new Random();
                    num = random.nextInt(7) + 1;
                }
            }

        }
        move_1[c_1][r_1] = 2;
        move_2[c_2][r_2] = 2;
        move_3[c_3][r_3] = 2;
        move_4[c_4][r_4] = 2;
        move_5[c_5][r_5] = 2;
        move_6[c_6][r_6] = 2;
        move_7[c_7][r_7] = 2;
        switch(num) {

            case 1:
                computerI = c_1;
                computerY = r_1;
                return move_1;
            case 2:
                computerI = c_2;
                computerY = r_2;
                return move_2;
            case 3:
                computerI = c_3;
                computerY = r_3;
                return move_3;
            case 4:
                computerI = c_4;
                computerY = r_4;
                return move_4;
            case 5:
                computerI = c_5;
                computerY = r_5;
                return move_5;
            case 6:
                computerI = c_6;
                computerY = r_6;
                return move_6;
            case 7:
                computerI = c_7;
                computerY = r_7;
                return move_7;
            default:
                break;
        }
        return current_board;
    }
}

//TEST UPLOAD

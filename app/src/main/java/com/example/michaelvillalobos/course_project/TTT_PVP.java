package com.example.michaelvillalobos.course_project;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class TTT_PVP extends AppCompatActivity {
    int playerTurn = 1;
    int spots = 0;
    int P1Score = 0;
    int P2Score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ttt__pvp);

        final TextView displayTurn = findViewById(R.id.textView6);
        final Button bt100 = findViewById(R.id.button100);
        final Button bt010 = findViewById(R.id.button010);
        final Button bt001 = findViewById(R.id.button001);
        final Button bt200 = findViewById(R.id.button200);
        final Button bt020 = findViewById(R.id.button020);
        final Button bt002 = findViewById(R.id.button002);
        final Button bt300 = findViewById(R.id.button300);
        final Button bt030 = findViewById(R.id.button030);
        final Button bt003 = findViewById(R.id.button003);
        final Button play = findViewById(R.id.button7);
        play.setEnabled(false);

        bt100.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(playerTurn == 1) {
                    bt100.setText("X");
                    playerTurn++;
                    bt100.setEnabled(false);
                    spots++;
                    int p1 = checkBoardX();
                    if(p1 == 1) {
                        Toast.makeText(getApplication().getApplicationContext(), "Player 1 Wins!", Toast.LENGTH_LONG).show();
                        play.setEnabled(true);
                    }
                    else if(spots == 9) {
                        Toast.makeText(getApplication().getApplicationContext(), "Tied Game!", Toast.LENGTH_LONG).show();
                        play.setEnabled(true);
                    }
                    else
                        displayTurn.setText("Player 2's Turn");
                }
                else {
                    bt100.setText("O");
                    playerTurn--;
                    bt100.setEnabled(false);
                    spots++;
                    int p2 = checkBoardO();
                    if(p2 == 2) {
                        Toast.makeText(getApplication().getApplicationContext(), "Player 2 Wins!", Toast.LENGTH_LONG).show();
                        play.setEnabled(true);
                    }
                    else if(spots == 9) {
                        Toast.makeText(getApplication().getApplicationContext(), "Tied Game!", Toast.LENGTH_LONG).show();
                        play.setEnabled(true);
                    }
                    else
                        displayTurn.setText("Player 1's Turn");
                }
            }
        });

        bt010.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(playerTurn == 1) {
                    bt010.setText("X");
                    playerTurn++;
                    bt010.setEnabled(false);
                    spots++;
                    int p1 = checkBoardX();
                    if(p1 == 1) {
                        Toast.makeText(getApplication().getApplicationContext(), "Player 1 Wins!", Toast.LENGTH_LONG).show();
                        play.setEnabled(true);
                    }
                    else if(spots == 9) {
                        Toast.makeText(getApplication().getApplicationContext(), "Tied Game!", Toast.LENGTH_LONG).show();
                        play.setEnabled(true);
                    }
                    else
                        displayTurn.setText("Player 2's Turn");
                }
                else {
                    bt010.setText("O");
                    playerTurn--;
                    bt010.setEnabled(false);
                    spots++;
                    int p2 = checkBoardO();
                    if(p2 == 2) {
                        Toast.makeText(getApplication().getApplicationContext(), "Player 2 Wins!", Toast.LENGTH_LONG).show();
                        play.setEnabled(true);
                    }
                    else if(spots == 9) {
                        Toast.makeText(getApplication().getApplicationContext(), "Tied Game!", Toast.LENGTH_LONG).show();
                        play.setEnabled(true);
                    }
                    else
                        displayTurn.setText("Player 1's Turn");
                }
            }
        });

        bt001.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(playerTurn == 1) {
                    bt001.setText("X");
                    playerTurn++;
                    bt001.setEnabled(false);
                    spots++;
                    int p1 = checkBoardX();
                    if(p1 == 1) {
                        Toast.makeText(getApplication().getApplicationContext(), "Player 1 Wins!", Toast.LENGTH_LONG).show();
                        play.setEnabled(true);
                    }
                    else if(spots == 9) {
                        Toast.makeText(getApplication().getApplicationContext(), "Tied Game!", Toast.LENGTH_LONG).show();
                        play.setEnabled(true);
                    }
                    else
                        displayTurn.setText("Player 2's Turn");
                }
                else {
                    bt001.setText("O");
                    playerTurn--;
                    bt001.setEnabled(false);
                    spots++;
                    int p2 = checkBoardO();
                    if(p2 == 2) {
                        Toast.makeText(getApplication().getApplicationContext(), "Player 2 Wins!", Toast.LENGTH_LONG).show();
                        play.setEnabled(true);
                    }
                    else if(spots == 9) {
                        Toast.makeText(getApplication().getApplicationContext(), "Tied Game!", Toast.LENGTH_LONG).show();
                        play.setEnabled(true);
                    }
                    else
                        displayTurn.setText("Player 1's Turn");
                }
            }
        });

        bt200.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(playerTurn == 1) {
                    bt200.setText("X");
                    playerTurn++;
                    bt200.setEnabled(false);
                    spots++;
                    int p1 = checkBoardX();
                    if(p1 == 1) {
                        Toast.makeText(getApplication().getApplicationContext(), "Player 1 Wins!", Toast.LENGTH_LONG).show();
                        play.setEnabled(true);
                    }
                    else if(spots == 9) {
                        Toast.makeText(getApplication().getApplicationContext(), "Tied Game!", Toast.LENGTH_LONG).show();
                        play.setEnabled(true);
                    }
                    else
                        displayTurn.setText("Player 2's Turn");
                }
                else {
                    bt200.setText("O");
                    playerTurn--;
                    bt200.setEnabled(false);
                    spots++;
                    int p2 = checkBoardO();
                    if(p2 == 2) {
                        Toast.makeText(getApplication().getApplicationContext(), "Player 2 Wins!", Toast.LENGTH_LONG).show();
                        play.setEnabled(true);
                    }
                    else if(spots == 9) {
                        Toast.makeText(getApplication().getApplicationContext(), "Tied Game!", Toast.LENGTH_LONG).show();
                        play.setEnabled(true);
                    }
                    else
                        displayTurn.setText("Player 1's Turn");
                }
            }
        });

        bt020.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(playerTurn == 1) {
                    bt020.setText("X");
                    playerTurn++;
                    bt020.setEnabled(false);
                    spots++;
                    int p1 = checkBoardX();
                    if(p1 == 1) {
                        Toast.makeText(getApplication().getApplicationContext(), "Player 1 Wins!", Toast.LENGTH_LONG).show();
                        play.setEnabled(true);
                    }
                    else if(spots == 9) {
                        Toast.makeText(getApplication().getApplicationContext(), "Tied Game!", Toast.LENGTH_LONG).show();
                        play.setEnabled(true);
                    }
                    else
                        displayTurn.setText("Player 2's Turn");
                }
                else {
                    bt020.setText("O");
                    playerTurn--;
                    bt020.setEnabled(false);
                    spots++;
                    int p2 = checkBoardO();
                    if(p2 == 2) {
                        Toast.makeText(getApplication().getApplicationContext(), "Player 2 Wins!", Toast.LENGTH_LONG).show();
                        play.setEnabled(true);
                    }
                    else if(spots == 9) {
                        Toast.makeText(getApplication().getApplicationContext(), "Tied Game!", Toast.LENGTH_LONG).show();
                        play.setEnabled(true);
                    }
                    else
                        displayTurn.setText("Player 1's Turn");
                }
            }
        });

        bt002.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(playerTurn == 1) {
                    bt002.setText("X");
                    playerTurn++;
                    bt002.setEnabled(false);
                    spots++;
                    int p1 = checkBoardX();
                    if(p1 == 1) {
                        Toast.makeText(getApplication().getApplicationContext(), "Player 1 Wins!", Toast.LENGTH_LONG).show();
                        play.setEnabled(true);
                    }
                    else if(spots == 9) {
                        Toast.makeText(getApplication().getApplicationContext(), "Tied Game!", Toast.LENGTH_LONG).show();
                        play.setEnabled(true);
                    }
                    else
                        displayTurn.setText("Player 2's Turn");
                }
                else {
                    bt002.setText("O");
                    playerTurn--;
                    bt002.setEnabled(false);
                    spots++;
                    int p2 = checkBoardO();
                    if(p2 == 2) {
                        Toast.makeText(getApplication().getApplicationContext(), "Player 2 Wins!", Toast.LENGTH_LONG).show();
                        play.setEnabled(true);
                    }
                    else if(spots == 9) {
                        Toast.makeText(getApplication().getApplicationContext(), "Tied Game!", Toast.LENGTH_LONG).show();
                        play.setEnabled(true);
                    }
                    else
                        displayTurn.setText("Player 1's Turn");
                }
            }
        });

        bt300.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(playerTurn == 1) {
                    bt300.setText("X");
                    playerTurn++;
                    bt300.setEnabled(false);
                    spots++;
                    int p1 = checkBoardX();
                    if(p1 == 1) {
                        Toast.makeText(getApplication().getApplicationContext(), "Player 1 Wins!", Toast.LENGTH_LONG).show();
                        play.setEnabled(true);
                    }
                    else if(spots == 9) {
                        Toast.makeText(getApplication().getApplicationContext(), "Tied Game!", Toast.LENGTH_LONG).show();
                        play.setEnabled(true);
                    }
                    else
                        displayTurn.setText("Player 2's Turn");
                }
                else {
                    bt300.setText("O");
                    playerTurn--;
                    bt300.setEnabled(false);
                    spots++;
                    int p2 = checkBoardO();
                    if(p2 == 2) {
                        Toast.makeText(getApplication().getApplicationContext(), "Player 2 Wins!", Toast.LENGTH_LONG).show();
                        play.setEnabled(true);
                    }
                    else if(spots == 9) {
                        Toast.makeText(getApplication().getApplicationContext(), "Tied Game!", Toast.LENGTH_LONG).show();
                        play.setEnabled(true);
                    }
                    else
                        displayTurn.setText("Player 1's Turn");
                }
            }
        });

        bt030.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(playerTurn == 1) {
                    bt030.setText("X");
                    playerTurn++;
                    bt030.setEnabled(false);
                    spots++;
                    int p1 = checkBoardX();
                    if(p1 == 1) {
                        Toast.makeText(getApplication().getApplicationContext(), "Player 1 Wins!", Toast.LENGTH_LONG).show();
                        play.setEnabled(true);
                    }
                    else if(spots == 9) {
                        Toast.makeText(getApplication().getApplicationContext(), "Tied Game!", Toast.LENGTH_LONG).show();
                        play.setEnabled(true);
                    }
                    else
                        displayTurn.setText("Player 2's Turn");
                }
                else {
                    bt030.setText("O");
                    playerTurn--;
                    bt030.setEnabled(false);
                    spots++;
                    int p2 = checkBoardO();
                    if(p2 == 2) {
                        Toast.makeText(getApplication().getApplicationContext(), "Player 2 Wins!", Toast.LENGTH_LONG).show();
                        play.setEnabled(true);
                    }
                    else if(spots == 9) {
                        Toast.makeText(getApplication().getApplicationContext(), "Tied Game!", Toast.LENGTH_LONG).show();
                        play.setEnabled(true);
                    }
                    else
                        displayTurn.setText("Player 1's Turn");
                }
            }
        });

        bt003.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(playerTurn == 1) {
                    bt003.setText("X");
                    playerTurn++;
                    bt003.setEnabled(false);
                    spots++;
                    int p1 = checkBoardX();
                    if(p1 == 1) {
                        Toast.makeText(getApplication().getApplicationContext(), "Player 1 Wins!", Toast.LENGTH_LONG).show();
                        play.setEnabled(true);
                    }
                    else if(spots == 9) {
                        Toast.makeText(getApplication().getApplicationContext(), "Tied Game!", Toast.LENGTH_LONG).show();
                        play.setEnabled(true);
                    }
                    else
                        displayTurn.setText("Player 2's Turn");
                }
                else {
                    bt003.setText("O");
                    playerTurn--;
                    bt003.setEnabled(false);
                    spots++;
                    int p2 = checkBoardO();
                    if(p2 == 2) {
                        Toast.makeText(getApplication().getApplicationContext(), "Player 2 Wins!", Toast.LENGTH_LONG).show();
                        play.setEnabled(true);
                    }
                    else if(spots == 9) {
                        Toast.makeText(getApplication().getApplicationContext(), "Tied Game!", Toast.LENGTH_LONG).show();
                        play.setEnabled(true);
                    }
                    else
                        displayTurn.setText("Player 1's Turn");
                }
            }
        });

    } // end main

    public int checkBoardX() {
        Button bt100 = findViewById(R.id.button100);
        Button bt010 = findViewById(R.id.button010);
        Button bt001 = findViewById(R.id.button001);
        Button bt200 = findViewById(R.id.button200);
        Button bt020 = findViewById(R.id.button020);
        Button bt002 = findViewById(R.id.button002);
        Button bt300 = findViewById(R.id.button300);
        Button bt030 = findViewById(R.id.button030);
        Button bt003 = findViewById(R.id.button003);
        TextView p1 = findViewById(R.id.textView7);
        TextView p2 = findViewById(R.id.textView8);
        Button play = findViewById(R.id.button7);


        // TODO: improve this flow, its just a rough template right now
        if (bt100.getText().toString().equalsIgnoreCase("X")) {
            if (bt010.getText().toString().equalsIgnoreCase("X")) {
                if (bt001.getText().toString().equalsIgnoreCase("X")) {
                    // Winner by Top Row
                    P1Score++;
                    Disable();
                    return 1;
                }
            }
            if (bt200.getText().toString().equalsIgnoreCase("X")) {
                if (bt300.getText().toString().equalsIgnoreCase("X")) {
                    // Winner by Left Column
                    P1Score++;
                    return 1;
                }
            }
            if (bt020.getText().toString().equalsIgnoreCase("X")) {
                if (bt003.getText().toString().equalsIgnoreCase("X")) {
                    // Winner by Diagonal top left -> bottom Right
                    P1Score++;
                    Disable();
                    return 1;
                }
            }
        }

        if (bt200.getText().toString().equalsIgnoreCase("X")) {
            if (bt020.getText().toString().equalsIgnoreCase("X")) {
                if (bt002.getText().toString().equalsIgnoreCase("X")) {
                    // Winner by Middle Row
                    P1Score++;
                    Disable();
                    return 1;
                }
            }
        }

        if (bt300.getText().toString().equalsIgnoreCase("X")) {
            if (bt030.getText().toString().equalsIgnoreCase("X")) {
                if (bt003.getText().toString().equalsIgnoreCase("X")) {
                    // Winner by Bottom Row
                    P1Score++;
                    return 1;
                }
            }
        }

        if (bt010.getText().toString().equalsIgnoreCase("X")) {
            if (bt020.getText().toString().equalsIgnoreCase("X")) {
                if (bt030.getText().toString().equalsIgnoreCase("X")) {
                    // Winner by Middle Column
                    P1Score++;
                    Disable();
                    return 1;
                }
            }
        }

        if (bt001.getText().toString().equalsIgnoreCase("X")) {
            if (bt002.getText().toString().equalsIgnoreCase("X")) {
                if (bt003.getText().toString().equalsIgnoreCase("X")) {
                    // Winner by Right Column
                    P1Score++;
                    Disable();
                    return 1;
                }
            }
        }

        if (bt300.getText().toString().equalsIgnoreCase("X")) {
            if (bt020.getText().toString().equalsIgnoreCase("X")) {
                if (bt001.getText().toString().equalsIgnoreCase("X")) {
                    // Winner by Diagonal from bottom left -> top right
                    P1Score++;
                    Disable();
                    return 1;
                }
            }
        }
        return 0;
    }

    public int checkBoardO() {
        Button bt100 = findViewById(R.id.button100);
        Button bt010 = findViewById(R.id.button010);
        Button bt001 = findViewById(R.id.button001);
        Button bt200 = findViewById(R.id.button200);
        Button bt020 = findViewById(R.id.button020);
        Button bt002 = findViewById(R.id.button002);
        Button bt300 = findViewById(R.id.button300);
        Button bt030 = findViewById(R.id.button030);
        Button bt003 = findViewById(R.id.button003);


        // TODO: improve this flow, its just a rough template right now
        if (bt100.getText().toString().equalsIgnoreCase("O")) {
            if (bt010.getText().toString().equalsIgnoreCase("O")) {
                if (bt001.getText().toString().equalsIgnoreCase("O")) {
                    // Winner by Top Row
                    P2Score++;
                    Disable();
                    return 2;
                }
            }
            if (bt200.getText().toString().equalsIgnoreCase("O")) {
                if (bt300.getText().toString().equalsIgnoreCase("O")) {
                    // Winner by Left Column
                    P2Score++;
                    Disable();
                    return 2;
                }
            }
            if (bt020.getText().toString().equalsIgnoreCase("O")) {
                if (bt003.getText().toString().equalsIgnoreCase("O")) {
                    // Winner by Diagonal top left -> bottom Right
                    P2Score++;
                    Disable();
                    return 2;
                }
            }
        }

        if (bt200.getText().toString().equalsIgnoreCase("O")) {
            if (bt020.getText().toString().equalsIgnoreCase("O")) {
                if (bt002.getText().toString().equalsIgnoreCase("O")) {
                    // Winner by Middle Row
                    P2Score++;
                    Disable();
                    return 2;
                }
            }
        }

        if (bt300.getText().toString().equalsIgnoreCase("O")) {
            if (bt030.getText().toString().equalsIgnoreCase("O")) {
                if (bt003.getText().toString().equalsIgnoreCase("O")) {
                    // Winner by Bottom Row
                    P2Score++;
                    Disable();
                    return 2;
                }
            }
        }

        if (bt010.getText().toString().equalsIgnoreCase("O")) {
            if (bt020.getText().toString().equalsIgnoreCase("O")) {
                if (bt030.getText().toString().equalsIgnoreCase("O")) {
                    // Winner by Middle Column
                    P2Score++;
                    Disable();
                    return 2;
                }
            }
        }

        if (bt001.getText().toString().equalsIgnoreCase("O")) {
            if (bt002.getText().toString().equalsIgnoreCase("O")) {
                if (bt003.getText().toString().equalsIgnoreCase("O")) {
                    // Winner by Right Column
                    P2Score++;
                    Disable();
                    return 2;
                }
            }
        }

        if (bt300.getText().toString().equalsIgnoreCase("O")) {
            if (bt020.getText().toString().equalsIgnoreCase("O")) {
                if (bt001.getText().toString().equalsIgnoreCase("O")) {
                    // Winner by Diagonal from bottom left -> top right
                    P2Score++;
                    Disable();
                    return 2;
                }
            }
        }

        return 0;
    }

    public void playAgain(View view) {
        Button bt100 = findViewById(R.id.button100);
        Button bt010 = findViewById(R.id.button010);
        Button bt001 = findViewById(R.id.button001);
        Button bt200 = findViewById(R.id.button200);
        Button bt020 = findViewById(R.id.button020);
        Button bt002 = findViewById(R.id.button002);
        Button bt300 = findViewById(R.id.button300);
        Button bt030 = findViewById(R.id.button030);
        Button bt003 = findViewById(R.id.button003);
        TextView p1 = findViewById(R.id.textView7);
        TextView p2 = findViewById(R.id.textView8);
        Button play = findViewById(R.id.button7);
        TextView displayTurn = findViewById(R.id.textView6);
        spots = 0;

        if(displayTurn.getText().toString().equalsIgnoreCase("Player 1's Turn")) {
            displayTurn.setText("Player 2's Turn");
        }
        else
            displayTurn.setText("Player 1's Turn");

        bt001.setText("");
        bt002.setText("");
        bt003.setText("");
        bt010.setText("");
        bt020.setText("");
        bt030.setText("");
        bt100.setText("");
        bt200.setText("");
        bt300.setText("");

        bt001.setEnabled(true);
        bt002.setEnabled(true);
        bt003.setEnabled(true);
        bt010.setEnabled(true);
        bt020.setEnabled(true);
        bt030.setEnabled(true);
        bt100.setEnabled(true);
        bt200.setEnabled(true);
        bt300.setEnabled(true);

        play.setEnabled(false);
        p1.setText("Player 1 Score: " + P1Score);
        p2.setText("Player 2 Score: " + P2Score);
    }

    public void Disable() {
        Button bt100 = findViewById(R.id.button100);
        Button bt010 = findViewById(R.id.button010);
        Button bt001 = findViewById(R.id.button001);
        Button bt200 = findViewById(R.id.button200);
        Button bt020 = findViewById(R.id.button020);
        Button bt002 = findViewById(R.id.button002);
        Button bt300 = findViewById(R.id.button300);
        Button bt030 = findViewById(R.id.button030);
        Button bt003 = findViewById(R.id.button003);

        bt001.setEnabled(false);
        bt002.setEnabled(false);
        bt003.setEnabled(false);
        bt010.setEnabled(false);
        bt020.setEnabled(false);
        bt030.setEnabled(false);
        bt100.setEnabled(false);
        bt200.setEnabled(false);
        bt300.setEnabled(false);
    }

    public void onBackPressed() {
        finish();
    }
} // end class
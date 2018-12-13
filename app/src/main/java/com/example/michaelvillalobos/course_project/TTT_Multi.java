package com.example.michaelvillalobos.course_project;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;


public class TTT_Multi extends AppCompatActivity implements ValueEventListener {

    // Declare DB
    private FirebaseDatabase database;
    private DatabaseReference tttDB;
    private FirebaseAuth mAuth;
    private FirebaseAuth.AuthStateListener mAuthListener;
    private String userID;
    int playerTurn = 1;
    int spots = 0;
    int P1Score = 0;
    int P2Score = 0;
    int buttonPress = 0;
    String childVal = "c1";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ttt__pvp);

        /* Initial setup for database connection */
        mAuth = FirebaseAuth.getInstance();
        database = FirebaseDatabase.getInstance();
        tttDB = database.getReferenceFromUrl("https://tic-tac-toe-f7a06.firebaseio.com/");

        try {
            mAuth.signInWithEmailAndPassword("mvillal3@gmu.edu", "password1");
            FirebaseUser user = mAuth.getCurrentUser();
            userID = user.getUid();
        } catch(Exception e){}

        /* Check for Successful Login */
        mAuthListener = new FirebaseAuth.AuthStateListener() {
            @Override
            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {
                FirebaseUser user = firebaseAuth.getCurrentUser();
                if(user != null) {
                    toastMessage("Successful Logged in");
                }
                else
                    toastMessage("Successfully Logged out");
            }
        };

        /* Listener for when data is altered within the Database */
        DatabaseReference mchild = tttDB.child("user").child("15BPPryfz1SjnUZE4nYbWntpwni2");
        mchild.addValueEventListener(this);

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
                    updateDB("c1", "1");
                    buttonPress = 1;
                    childVal = "c1";
                    playerTurn++;
                    bt100.setEnabled(false);
                    spots++;
                }
                else {
                    updateDB("c1", "2");
                    buttonPress = 1;
                    childVal = "c1";
                    playerTurn--;
                    bt100.setEnabled(false);
                    spots++;
                }
            }
        });

        bt010.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(playerTurn == 1) {
                    updateDB("c2", "1");
                    buttonPress = 2;
                    childVal = "c2";
                    playerTurn++;
                    bt010.setEnabled(false);
                    spots++;
                }
                else {
                    updateDB("c2", "2");
                    buttonPress = 2;
                    childVal = "c2";
                    playerTurn--;
                    bt010.setEnabled(false);
                    spots++;
                }
            }
        });

        bt001.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(playerTurn == 1) {
                    updateDB("c3", "1");
                    buttonPress = 3;
                    childVal = "c3";
                    playerTurn++;
                    bt001.setEnabled(false);
                    spots++;
                }
                else {
                    updateDB("c3", "2");
                    buttonPress = 3;
                    childVal = "c3";
                    playerTurn--;
                    bt001.setEnabled(false);
                    spots++;
                }
            }
        });

        bt200.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(playerTurn == 1) {
                    updateDB("c4", "1");
                    buttonPress = 4;
                    childVal = "c4";
                    playerTurn++;
                    bt200.setEnabled(false);
                    spots++;
                }
                else {
                    updateDB("c4", "2");
                    buttonPress = 4;
                    childVal = "c4";
                    playerTurn--;
                    bt200.setEnabled(false);
                    spots++;
                }
            }
        });

        bt020.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(playerTurn == 1) {
                    updateDB("c5", "1");
                    buttonPress = 5;
                    childVal = "c5";
                    playerTurn++;
                    bt020.setEnabled(false);
                    spots++;
                }
                else {
                    updateDB("c5", "2");
                    buttonPress = 5;
                    childVal = "c5";
                    playerTurn--;
                    bt020.setEnabled(false);
                    spots++;
                }
            }
        });

        bt002.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(playerTurn == 1) {
                    updateDB("c6", "1");
                    buttonPress = 6;
                    childVal = "c6";
                    playerTurn++;
                    bt002.setEnabled(false);
                    spots++;
                }
                else {
                    updateDB("c6", "2");
                    buttonPress = 6;
                    childVal = "c6";
                    playerTurn--;
                    bt002.setEnabled(false);
                    spots++;
                }
            }
        });

        bt300.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(playerTurn == 1) {
                    updateDB("c7", "1");
                    buttonPress = 7;
                    childVal = "c7";
                    playerTurn++;
                    bt300.setEnabled(false);
                    spots++;
                }
                else {
                    updateDB("c7", "2");
                    buttonPress = 7;
                    childVal = "c7";
                    playerTurn--;
                    bt300.setEnabled(false);
                    spots++;
                }
            }
        });

        bt030.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(playerTurn == 1) {
                    updateDB("c8", "1");
                    buttonPress = 8;
                    childVal = "c8";
                    playerTurn++;
                    bt030.setEnabled(false);
                    spots++;
                }
                else {
                    updateDB("c8", "2");
                    buttonPress = 8;
                    childVal = "c8";
                    playerTurn--;
                    bt030.setEnabled(false);
                    spots++;
                }
            }
        });

        bt003.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(playerTurn == 1) {
                    updateDB("c9", "1");
                    buttonPress = 9;
                    childVal = "c9";
                    playerTurn++;
                    bt003.setEnabled(false);
                    spots++;
                }
                else {
                    updateDB("c9", "2");
                    buttonPress = 9;
                    childVal = "c9";
                    playerTurn--;
                    bt003.setEnabled(false);
                    spots++;
                }
            }
        });

    }

    @Override
    public void onStart() {
        super.onStart();
        mAuth.addAuthStateListener(mAuthListener);
    }

    @Override
    public void onStop() {
        super.onStop();
        if(mAuthListener != null)
            mAuth.addAuthStateListener(mAuthListener);
    }

    private void toastMessage(String message) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show();
    }

    public int checkBoard() {
        Button bt100 = findViewById(R.id.button100);
        Button bt010 = findViewById(R.id.button010);
        Button bt001 = findViewById(R.id.button001);
        Button bt200 = findViewById(R.id.button200);
        Button bt020 = findViewById(R.id.button020);
        Button bt002 = findViewById(R.id.button002);
        Button bt300 = findViewById(R.id.button300);
        Button bt030 = findViewById(R.id.button030);
        Button bt003 = findViewById(R.id.button003);


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
                    Disable();
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

        tttDB = database.getReferenceFromUrl("https://tic-tac-toe-f7a06.firebaseio.com/");
        DatabaseReference tttdb3 = tttDB.child("user").child("15BPPryfz1SjnUZE4nYbWntpwni2");
        tttdb3.child("c1").setValue("0");
        tttdb3.child("c2").setValue("0");
        tttdb3.child("c3").setValue("0");
        tttdb3.child("c4").setValue("0");
        tttdb3.child("c5").setValue("0");
        tttdb3.child("c6").setValue("0");
        tttdb3.child("c7").setValue("0");
        tttdb3.child("c8").setValue("0");
        tttdb3.child("c9").setValue("0");
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

    public void updateDB(String key, String val) {
        tttDB = database.getReferenceFromUrl("https://tic-tac-toe-f7a06.firebaseio.com/");
        DatabaseReference tttdbWrite = tttDB.child("user").child("15BPPryfz1SjnUZE4nYbWntpwni2");
        tttdbWrite.child(key).setValue(val);
    }

    @Override
    public void onDataChange(DataSnapshot dataSnapshot) {
        String val = dataSnapshot.child(childVal).getValue(String.class);
        int num = Integer.parseInt(val);
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
        final TextView displayTurn = findViewById(R.id.textView6);

        switch (buttonPress) {
            case 1:
                if(num == 1)
                    bt100.setText("X");
                else if(num == 2)
                    bt100.setText("O");
                break;
            case 2:
                if(num == 1)
                    bt010.setText("X");
                else if(num == 2)
                    bt010.setText("O");
                break;
            case 3:
                if(num == 1)
                    bt001.setText("X");
                else if(num == 2)
                    bt001.setText("O");
                break;
            case 4:
                if(num == 1)
                    bt200.setText("X");
                else if(num == 2)
                    bt200.setText("O");
                break;
            case 5:
                if(num == 1)
                    bt020.setText("X");
                else if(num == 2)
                    bt020.setText("O");
                break;
            case 6:
                if(num == 1)
                    bt002.setText("X");
                else if(num == 2)
                    bt002.setText("O");
                break;
            case 7:
                if(num == 1)
                    bt300.setText("X");
                else if(num == 2)
                    bt300.setText("O");
                break;
            case 8:
                if(num == 1)
                    bt030.setText("X");
                else if(num == 2)
                    bt030.setText("O");
                break;
            case 9:
                if(num == 1)
                    bt003.setText("X");
                else if(num == 2)
                    bt003.setText("O");
                break;
            default:
                break;
        }

        int check = checkBoard();
        if(check == 1) {
            Toast.makeText(getApplication().getApplicationContext(), "Player 1 Wins!", Toast.LENGTH_LONG).show();
            play.setEnabled(true);
        }
        else if(check == 2) {
            Toast.makeText(getApplication().getApplicationContext(), "Player 2 Wins!", Toast.LENGTH_LONG).show();
            play.setEnabled(true);
        }
        else if(spots == 9) {
            Toast.makeText(getApplication().getApplicationContext(), "Tied Game!", Toast.LENGTH_LONG).show();
            play.setEnabled(true);
        }
        else if(playerTurn == 1) {
            displayTurn.setText("Player 1's Turn");
        }
        else if(playerTurn == 2) {
            displayTurn.setText("Player 2's Turn");
        }


        buttonPress = 0;
        num = 0;
    }

    @Override
    public void onCancelled(DatabaseError databaseError) {

    }
}

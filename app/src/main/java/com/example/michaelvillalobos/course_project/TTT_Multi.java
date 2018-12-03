package com.example.michaelvillalobos.course_project;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;


public class TTT_Multi extends AppCompatActivity {

    // Declare DB
    private FirebaseDatabase database;
    private DatabaseReference tttDB;
    private FirebaseAuth mAuth;
    private FirebaseAuth.AuthStateListener mAuthListener;
    private String userID;

    TextView c1 = findViewById(R.id.textView9);
    TextView c2 = findViewById(R.id.textView10);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ttt_multi);

        mAuth = FirebaseAuth.getInstance();
        database = FirebaseDatabase.getInstance();
        tttDB = database.getReferenceFromUrl("https://tic-tac-toe-f7a06.firebaseio.com/");
        mAuth.signInWithEmailAndPassword("mvillal3@gmu.edu", "password1");
        FirebaseUser user = mAuth.getCurrentUser();
        userID = user.getUid();

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

        DatabaseReference mchild = tttDB.child("tic-tac-toe-f7a06").child("user").child("15BPPryfz1SjnUZE4nYbWntpwni2").child("c1");
        mchild.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                int val = Integer.parseInt(dataSnapshot.getValue(String.class));
//                showData(dataSnapshot);
                c2.setText(val);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

    }

    private void showData(DataSnapshot dataSnapshot) {
        for(DataSnapshot ds : dataSnapshot.getChildren()) {
//            try {
            TTTCellData userInfo = new TTTCellData();
            userInfo.setValue(ds.child(userID).getValue(TTTCellData.class).getCellValue()); // set the value of the cell
            TextView C1 = findViewById(R.id.textView9);
            C1.setText(userID);
//            C1.setText(userInfo.getCellValue());
//            }catch(Exception e){}
        }

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

}

package com.example.michaelvillalobos.course_project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class play_ttt extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_ttt);
    }
    public void PVP_ttt(View view) {
        Intent intent = new Intent(this, TTT_PVP.class);
        startActivityForResult(intent, 1);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if(resultCode == 1)
            Toast.makeText(getApplication().getApplicationContext(), "Player 1 Wins!", Toast.LENGTH_LONG).show();
        else if(resultCode == 2)
            Toast.makeText(getApplication().getApplicationContext(), "Player 2 Wins!", Toast.LENGTH_LONG).show();
        else
            Toast.makeText(getApplication().getApplicationContext(), "Tie Game!", Toast.LENGTH_LONG).show();

    }
}

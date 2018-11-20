package com.example.michaelvillalobos.course_project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class play_ttt extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_ttt);
    }
    public void PVP_ttt(View view) {
        Intent intent = new Intent(this, TTT_PVP.class);
        startActivity(intent);
    }

}

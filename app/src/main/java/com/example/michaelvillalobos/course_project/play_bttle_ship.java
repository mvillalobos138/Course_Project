package com.example.michaelvillalobos.course_project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class play_bttle_ship extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_bttle_ship);
    }
    public void AI_btleship (View view) {
        Intent intent = new Intent(this, BTLESHIP_AI.class);
        startActivity(intent);
    }
    public void PVP_btleship(View view) {
        Intent intent = new Intent(this, BTLESHIP_PVP.class);
        startActivity(intent);
    }
}

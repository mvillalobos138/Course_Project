package com.example.michaelvillalobos.course_project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class play_cnect_4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_cnect_4);
    }
    public void AI_cnect4 (View view) {
        Intent intent = new Intent(this, CNECT4_AI.class);
        startActivity(intent);
    }
    public void PVP_cnect4(View view) {
        Intent intent = new Intent(this, CNECT4_PVP.class);
        startActivity(intent);
    }
}

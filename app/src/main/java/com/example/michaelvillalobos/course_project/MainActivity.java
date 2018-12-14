package com.example.michaelvillalobos.course_project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_page);
    }
    
    public void playttt(View view) {
        Intent intent = new Intent(this, TTT_Menu.class);
        startActivity(intent);
    }
    public void playCnect4(View view) {
        Intent intent = new Intent(this, Connect4_Menu.class);
        startActivity(intent);
    }
}
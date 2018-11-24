package com.example.michaelvillalobos.course_project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_page);
    }

    // TODO: Think that I fixed it.

    public void playttt(View view) {
        Intent intent = new Intent(this, play_ttt.class);
        startActivity(intent);
    }
    public void playCnect4(View view) {
        Intent intent = new Intent(this, play_cnect_4.class);
        startActivity(intent);
    }
    public void playBttleShip(View view) {
        Intent intent = new Intent(this, play_bttle_ship.class);
        startActivity(intent);
    }
}
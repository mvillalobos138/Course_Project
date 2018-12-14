package com.example.michaelvillalobos.course_project;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.GridView;
import android.widget.TextView;

public class Connect4_PVP extends AppCompatActivity {
    GridView gridView;
    GridAdapter adapter;
    View view;
    static int player = 0;
    static int p1S = 0;
    static int p2S = 0;

    int[] array_stuff = {
            0, 1, 2, 3, 4, 5, 6,
            7, 8, 9, 10, 11, 12, 13,
            14, 15, 16, 17, 18, 19, 20,
            21, 22, 23, 24, 25, 26, 27,
            28, 29, 30, 31, 32, 33, 34,
            35, 36, 37, 38, 39, 40, 41
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


        view = (View) findViewById(R.id.linearLayout8);
        gridView = (GridView) findViewById(R.id.grid_view);
        adapter = new GridAdapter(this, array_stuff, images);
        gridView.setAdapter(adapter);
    }

    public void connect4PlayAgain(View v) {
        adapter = new GridAdapter(this, array_stuff, images);
        TextView winner = findViewById(R.id.textView11);
        TextView p1Score = findViewById(R.id.textView12);
        TextView p2Score = findViewById(R.id.textView13);
        if(player == 1)
            winner.setText("Player 1 is the winner!");
        else
            winner.setText("Player 2 is the winner!");
        p1Score.setText("Player 1 Score: " + p1S);
        p2Score.setText("Player 2 Score: " + p2S);
        gridView.setAdapter(adapter);
    }
}

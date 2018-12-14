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
            0, 0, 0, 0, 0, 0, 0,
            0, 0, 0, 0, 0, 0, 0,
            0, 0, 0, 0, 0, 0, 0,
            0, 0, 0, 0, 0, 0, 0,
            0, 0, 0, 0, 0, 0, 0,
            0, 0, 0, 0, 0, 0, 0
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

        gridView = (GridView) findViewById(R.id.grid_view);
        adapter = new GridAdapter(this, array_stuff, images, gridView, adapter);
        gridView.setAdapter(adapter);
    }

    public void connect4PlayAgain(View v) {
        array_stuff = new int[] {
                0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0
        };
        Connect4_Menu.gameover = false;
        adapter = new GridAdapter(this, array_stuff, images, gridView, adapter);
        gridView.setAdapter(adapter);
        TextView winner = findViewById(R.id.textView11);
        TextView p1Score = findViewById(R.id.textView12);
        TextView p2Score = findViewById(R.id.textView13);
        if(player == 1)
            winner.setText("Player 1 is the winner!");
        else
            winner.setText("Player 2 is the winner!");
        p1Score.setText("Player 1 Score: " + p1S);
        p2Score.setText("Player 2 Score: " + p2S);
    }
}

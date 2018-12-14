package com.example.michaelvillalobos.course_project;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.GridView;
import android.widget.Toast;

public class Connect4_PVP extends AppCompatActivity {
    GridView gridView;
    GridAdapter adapter;

    static int[] array_stuff = {
            0, 1, 0, 0, 0, 0, 0,
            0, 0, 1, 0, 0, 0, 0,
            0, 0, 0, 0, 0, 0, 0,
            0, 0, 2, 0, 0, 0, 0,
            0, 0, 0, 0, 2, 0, 0,
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
        adapter = new GridAdapter(this, array_stuff, images, gridView, adapter);
        gridView.setAdapter(adapter);
    }

    public static void Update(int[] values) {
        array_stuff = values;
    }

    public static void Move(Context mContext, GridView gridView, GridAdapter adapter, int[] values) {
        array_stuff = values;
        array_stuff[0] = 2;
        adapter = new GridAdapter(mContext, array_stuff, images, gridView, adapter);
        gridView.setAdapter(adapter);
    }
}
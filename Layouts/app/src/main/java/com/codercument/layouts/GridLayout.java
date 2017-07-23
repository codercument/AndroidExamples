package com.codercument.layouts;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.view.View;
import android.widget.Toast;
/**
 * Created by ercum on 23.07.2017.
 */

public class GridLayout extends AppCompatActivity {

    TextView t1, t2, t3, t4, t5, t6, t7, t8, t9;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.grid_layout);
        setTitle("Grid Layout");
        t1 = (TextView) findViewById(R.id.text1);
        t2 = (TextView) findViewById(R.id.text2);
        t3 = (TextView) findViewById(R.id.text3);
        t4 = (TextView) findViewById(R.id.text4);
        t5 = (TextView) findViewById(R.id.text5);
        t6 = (TextView) findViewById(R.id.text6);
        t7 = (TextView) findViewById(R.id.text7);
        t8 = (TextView) findViewById(R.id.text8);
        t9 = (TextView) findViewById(R.id.text9);

        t1.setClickable(true);
        t2.setClickable(true);
        t3.setClickable(true);
        t4.setClickable(true);
        t5.setClickable(true);
        t6.setClickable(true);
        t7.setClickable(true);
        t8.setClickable(true);
        t9.setClickable(true);

        t1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                // TODO Auto-generated method stub

                Toast.makeText(getBaseContext(), "[0,0] Clicked",
                        Toast.LENGTH_SHORT).show();
            }
        });

        t2.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                // TODO Auto-generated method stub

                Toast.makeText(getBaseContext(), "[0,1] Clicked",
                        Toast.LENGTH_SHORT).show();
            }
        });

        t3.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                // TODO Auto-generated method stub

                Toast.makeText(getBaseContext(), "[0,2] Clicked",
                        Toast.LENGTH_SHORT).show();
            }
        });

        t4.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                // TODO Auto-generated method stub

                Toast.makeText(getBaseContext(), "[1,0] Clicked",
                        Toast.LENGTH_SHORT).show();
            }
        });

        t5.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                // TODO Auto-generated method stub

                Toast.makeText(getBaseContext(), "[1,1] Clicked",
                        Toast.LENGTH_SHORT).show();
            }
        });

        t6.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                // TODO Auto-generated method stub

                Toast.makeText(getBaseContext(), "[1,2] Clicked",
                        Toast.LENGTH_SHORT).show();
            }
        });

        t7.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                // TODO Auto-generated method stub

                Toast.makeText(getBaseContext(), "[2,0] Clicked",
                        Toast.LENGTH_SHORT).show();
            }
        });

        t8.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                // TODO Auto-generated method stub

                Toast.makeText(getBaseContext(), "[2,1] Clicked",
                        Toast.LENGTH_SHORT).show();
            }
        });

        t9.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                // TODO Auto-generated method stub

                Toast.makeText(getBaseContext(), "[2,2] Clicked",
                        Toast.LENGTH_SHORT).show();
            }
        });
    }


}

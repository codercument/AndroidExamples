package com.codercument.layouts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.widget.Spinner;
import android.widget.Button;
import android.widget.ArrayAdapter;

public class MainActivity extends AppCompatActivity {

    Spinner spinner ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = (Spinner) findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.examples, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setSelection(0);
    }

    public void onClick_B_Selectlayout (View view){

        String text = spinner.getSelectedItem().toString();
        Toast.makeText(this, text, Toast.LENGTH_SHORT).show();

    }
}

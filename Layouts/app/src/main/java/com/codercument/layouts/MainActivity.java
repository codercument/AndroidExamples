package com.codercument.layouts;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.Toast;
import android.widget.ArrayAdapter;

public class MainActivity extends AppCompatActivity {

    Spinner selectLayouts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        selectLayouts = (Spinner) findViewById(R.id.layoutspinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.layouts, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        selectLayouts.setAdapter(adapter);
    }

    public void onclick_buttonLayoutSelect(View view){

        int pos;
        final Intent intent;
        pos=selectLayouts.getSelectedItemPosition();
        switch (pos) {
            case 0:
                intent = new Intent(this, AbsoluteLayout.class);
                break;
            case 1:
                intent= new Intent(this,FrameLayout.class);
                break;
            case 2:
                intent = new Intent(this,GridLayout.class);
                break;
            case 3:
                intent = new Intent(this,LinearLayout.class);
                break;
            case 4:
                intent = new Intent(this,RelativeLayout.class);
                break;
            case 5:
                intent = new Intent(this,TableLayout.class);
                break;
            default:
                Toast.makeText(this, "Something wrong happened", Toast.LENGTH_SHORT).show();
                intent = new Intent(this,LinearLayout.class);
                break;
        }

        startActivity(intent);

    }
}

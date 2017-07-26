package com.codercument.arrayadapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    Button Bt_Save;
    Spinner Sp_City;
    EditText Edit_City;
    List<CharSequence> city;
    TextView Text_Durum;
    ArrayAdapter<CharSequence> adapter = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        city= new ArrayList<CharSequence>();
        city.add("İzmir");
        city.add("Ankara");
        city.add("İstanbul");

        Bt_Save =(Button) findViewById(R.id.button_Save);
        Sp_City =(Spinner) findViewById (R.id.Spinner_City);
        Edit_City = (EditText) findViewById(R.id.EditText_City);
        Text_Durum = (TextView) findViewById(R.id.Text_durum);

        adapter= new ArrayAdapter<CharSequence>(this,android.R.layout.simple_spinner_item,city);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        Sp_City.setAdapter(adapter);


    }

    public void onClick_Save (View view){

        String sehir_adi;
        sehir_adi=Edit_City.getText().toString();
        city.add(sehir_adi);
        Text_Durum.setText(sehir_adi + " eklendi");
        Edit_City.setText("");
        adapter.notifyDataSetChanged();

    }
}

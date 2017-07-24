package com.codercument.optionsmenu_xml;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inf= getMenuInflater();

        inf.inflate(R.menu.menu,menu);
        return true;

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {


        switch (item.getItemId()){

            case R.id.geridon:
                Toast.makeText(this, "Geri Don tıklandı", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.guncelle:
                Toast.makeText(this, "Güncelle tıklandı", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.menu1:
                Toast.makeText(this, "Menu 1 tıklandı", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.more:
                Toast.makeText(this, "Daha Fazla tıklandı", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.secenekler:
                Toast.makeText(this, "Seçenekler tıklandı", Toast.LENGTH_SHORT).show();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}

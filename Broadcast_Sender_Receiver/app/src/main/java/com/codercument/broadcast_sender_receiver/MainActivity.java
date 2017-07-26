package com.codercument.broadcast_sender_receiver;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void onClickBroadcast (View view){

        Intent intent = new Intent("com.codercument.broadcast.UYARI");
        intent.putExtra("MESAJ", "Bu bir broadcast yayınıdır");
        sendBroadcast(intent);
    }
}

package com.codercument.broadcast_sender_receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.widget.Toast;

/**
 * Created by ercument.turk on 26.07.2017.
 */

public class MessageReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {

        String message = intent.getStringExtra("MESAJ");

        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();

       

    }
}

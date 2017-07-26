package com.codercument.alertdialog;

import android.app.Dialog;
import android.content.DialogInterface;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    final private static int DIALOG_SAVE_ID=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickBtSave (View view){

    showDialog(DIALOG_SAVE_ID);

    }

    @Override
    protected Dialog onCreateDialog(int id) {

        Dialog dialog;
        switch(id){
            case DIALOG_SAVE_ID:
                dialog = getSaveDialog();
                break;
            default:
                return super.onCreateDialog(id);
        }
        return dialog;
    }

    private Dialog getSaveDialog(){

        AlertDialog.Builder builder = new AlertDialog.Builder(this);

        builder.setMessage("Emin misin?");

        builder.setPositiveButton("Evet", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this, "Evet tıklandı", Toast.LENGTH_SHORT).show();
            }
        });

        builder.setNegativeButton("Hayır", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this, "Hayır tıklandı", Toast.LENGTH_SHORT).show();
            }
        });

        builder.setCancelable(true);
        return builder.create();
    }
}

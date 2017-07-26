package com.codercument.simplecursoradapter;

import android.database.Cursor;
import android.provider.ContactsContract;
import android.support.v4.widget.SimpleCursorAdapter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        String [] projection = new String[]{ContactsContract.Contacts._ID,ContactsContract.Contacts.DISPLAY_NAME };

        Cursor cursor = getContentResolver().query(ContactsContract.Contacts.CONTENT_URI,projection,null,null,null);

        String[] from =new String[]{ContactsContract.Contacts.DISPLAY_NAME};
        int [] to = new int[] {android.R.id.text1};

        SimpleCursorAdapter adapter = new SimpleCursorAdapter(this,android.R.layout.simple_list_item_1,cursor,from,to);

        ListView list = (ListView)findViewById(R.id.list);
        list.setAdapter(adapter);
    }
}

package com.codercument.contexmenu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final int ID_SIL = Menu.FIRST;
    private static final int ID_DUZENLE= Menu.FIRST+1;
    ListView listName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listName= (ListView) findViewById(R.id.list_view);
        String [] names = getResources().getStringArray(R.array.list_items);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.list_main,names);
        listName.setAdapter(adapter);
        registerForContextMenu(listName);

    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {

        super.onCreateContextMenu(menu, v, menuInfo);

        menu.add(Menu.NONE,ID_SIL,0,"Sil");
        menu.add(Menu.NONE,ID_DUZENLE,1,"Düzenle");
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {

        AdapterView.AdapterContextMenuInfo info = (AdapterView.AdapterContextMenuInfo) item.getMenuInfo();

        TextView Tview = (TextView) info.targetView;

        switch (item.getItemId()){
            case ID_DUZENLE:
                Toast.makeText(this,Tview.getText() + " Düzenleme için seçildi" , Toast.LENGTH_SHORT).show();
                return true;
            case ID_SIL:
                Toast.makeText(this,Tview.getText() + " Silme için seçildi" , Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onContextItemSelected(item);
        }

    }
}

package com.codercument.optionsmenu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final int ID_GERI_DON = Menu.FIRST;
    private static final int ID_GUNCELLE = Menu.FIRST+1;
    private static final int ID_MENU1 = Menu.FIRST+2;
    private static final int ID_MENU2 = Menu.FIRST+3;
    private static final int ID_MENU3 = Menu.FIRST+4;
    private static final int ID_MORE = Menu.FIRST+5;
    private static final int ID_SECENEKLER = Menu.FIRST+6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);

        menu.add(Menu.NONE,ID_GERI_DON,0,"Geri Dön");
        menu.add(Menu.NONE,ID_GUNCELLE,1,"Güncelle");
        menu.add(Menu.NONE,ID_MENU1,2,"Menu 1");
        menu.add(Menu.NONE,ID_MENU2,3,"Menu 2");
        menu.add(Menu.NONE,ID_MENU3,4,"Menu 3");

        SubMenu smenu = menu.addSubMenu(Menu.NONE,ID_MORE,5,"Daha Fazla");
        smenu.add(Menu.NONE,ID_SECENEKLER,6,"Seçenekler");
        return true;

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()){
            case ID_GERI_DON:
                Toast.makeText(this, "Geri Dön Tıklandı", Toast.LENGTH_SHORT).show();
                return true;
            case ID_GUNCELLE:
                Toast.makeText(this, "Güncelle Tıklandı", Toast.LENGTH_SHORT).show();
                return true;
            case ID_MENU1:
                Toast.makeText(this, "Menu 1 Tıklandı", Toast.LENGTH_SHORT).show();
                return true;
            case ID_MENU2:
                Toast.makeText(this, "Menu 2 Tıklandı", Toast.LENGTH_SHORT).show();
                return true;
            case ID_MENU3:
                Toast.makeText(this, "Menu 2 Tıklandı", Toast.LENGTH_SHORT).show();
                return true;
            case ID_MORE:
                Toast.makeText(this, "Daha Fazla Tıklandı", Toast.LENGTH_SHORT).show();
                return true;
            case ID_SECENEKLER:
                Toast.makeText(this, "Seçenekeler Tıklandı", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }
}

package com.example.user.mysubmenuprogram;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static final int IDM_HELP = 101;
    public static final int IDM_NEW = 201;
    public static final int IDM_OPEN = 202;
    public static final int IDM_SAVE = 203;
    public static final int IDM_CUT = 301;
    public static final int IDM_COPY = 302;
    public static final int IDM_PASTE = 303;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        SubMenu subMenuFile = menu.addSubMenu("Файл");
        subMenuFile.add(Menu.NONE, IDM_NEW, Menu.NONE, "Новый");
        subMenuFile.add(Menu.NONE, IDM_OPEN, Menu.NONE, "Открыть");
        subMenuFile.add(Menu.NONE, IDM_SAVE, Menu.NONE, "Сохранить");
        SubMenu subMenuEdit = menu.addSubMenu("Правка");
        subMenuEdit.add(Menu.NONE, IDM_CUT, Menu.NONE, "Вырезать");
        subMenuEdit.add(Menu.NONE, IDM_COPY, Menu.NONE, "Копировать");
        subMenuEdit.add(Menu.NONE, IDM_PASTE, Menu.NONE, "Вставить");
        menu.add(Menu.NONE, IDM_HELP, Menu.NONE, "Справка");
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        CharSequence message;

        switch (item.getItemId()) {
            case IDM_NEW:
                message = "Выбран пункт Новый";
                break;
            case IDM_OPEN:
                message = "Выбран пункт Открыть";
                break;
            case IDM_SAVE:
                message = "Выбран пункт Сохранить";
                break;
            case IDM_CUT:
                message = "Выбран пункт Вырезать";
                break;
            case IDM_COPY:
                message = "Выбран пункт Копировать";
                break;
            case IDM_PASTE:
                message = "Выбран пункт Вставить";
                break;
            case IDM_HELP:
                message = "Выбран пункт Справка";
                break;
            default:
                return false;
        }
        // выводим уведомление о выбранном пункте меню
        Toast toast = Toast.makeText(this, message, Toast.LENGTH_LONG);

        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.show();
        return true;

    }
}

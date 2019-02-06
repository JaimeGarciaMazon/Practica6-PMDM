package com.example.practica6;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.menu.MenuBuilder;
import android.util.Log;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;

import static android.Manifest.permission.CALL_PHONE;

public class pantallaPersona extends AppCompatActivity {


    ImageView persona1;
    ImageView persona2;
    ImageView persona3;
    ImageView persona4;
    ImageView persona5;
    ImageView persona6;

    String Contacto="";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_persona);

        persona1 = findViewById(R.id.persona1);
        persona2 = findViewById(R.id.persona2);
        persona3 = findViewById(R.id.persona3);
        persona4 = findViewById(R.id.persona4);
        persona5 = findViewById(R.id.persona5);
        persona6 = findViewById(R.id.persona6);

        registerForContextMenu(persona1);
        registerForContextMenu(persona2);
        registerForContextMenu(persona3);
        registerForContextMenu(persona4);
        registerForContextMenu(persona5);
        registerForContextMenu(persona6);


        persona1.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                Contacto = "numero1";
                return false;
            }
        });
        persona2.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                Contacto = "numero2";
                return false;
            }
        });
        persona3.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                Contacto = "numero3";
                return false;
            }
        });
        persona4.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                Contacto = "numero4";
                return false;
            }
        });
        persona5.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                Contacto = "numero5";
                return false;
            }
        });
        persona6.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                Contacto = "numero6";
                return false;
            }
        });


    }
    @SuppressLint("RestrictedApi")
    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.menucontacto, menu);
        MenuBuilder m = (MenuBuilder) menu;
        m.setOptionalIconsVisible(true);
        return true;
    }
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menullamarcorreo, menu);
    }

    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId())
        {

            case R.id.opcion3:
                Intent opcion3 = new Intent(this,editarContacto.class);
                startActivity(opcion3);
                break;

        }

        return true;
    }

    public boolean onContextItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.opcion4:
                break;
            case R.id.opcion5:
                break;
        }
        return true;
    }

}

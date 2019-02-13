package com.example.practica6;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.menu.MenuBuilder;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Intent opcion1;
    Intent opcion2;
    ImageView persona;
    ImageView blogdenota;

    AppCompatActivity  nuevo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        opcion1=new Intent(this, pantallaPersona.class);
        opcion2=new Intent(this, blocdenota.class);

        persona = findViewById(R.id.idpersona);
        blogdenota = findViewById(R.id.idblocdenota);

        nuevo = this;



        persona.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(opcion1);
            }
        });

        blogdenota.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(opcion2);
            }
        });
    }




    @SuppressLint("RestrictedApi")
    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.menuprincipal, menu);
        MenuBuilder m = (MenuBuilder) menu;
        m.setOptionalIconsVisible(true);
        return true;

    }


    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId())
        {

            case R.id.opcion1:
                startActivity(opcion1);
                break;

            case R.id.opcion2:
                startActivity(opcion2);
                break;

        }

        return true;
    }


}

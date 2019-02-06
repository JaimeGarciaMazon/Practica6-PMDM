package com.example.practica6;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.Toast;

public class blocdenota extends AppCompatActivity {

    EditText idblocdenota;
    SharedPreferences sp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blocdenota);

        sp = getSharedPreferences("Escribir", Context.MODE_PRIVATE);
        idblocdenota = findViewById(R.id.idblocdenota);
        idblocdenota.setText(sp.getString("Blog",""));
    }

    @SuppressLint("NewApi")
    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        SharedPreferences.Editor editor = sp.edit();
        editor.putString("Blog", idblocdenota.getText().toString());
        editor.commit();
        Toast.makeText(this, getResources().getString(R.string.toast_guardado), Toast.LENGTH_LONG).show();
        return false;
    }
    @SuppressLint("RestrictedApi")
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menubloc, menu);
        return true;
    }
}

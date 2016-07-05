package com.facci.sesion4dt;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Toast;

public class RelativeLayoutDT extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relative_layout_dt);

        final String[] datos = new String[]{"Elemento 1","Elemento 2","Elemento 3"};

        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item,datos);



    }

    public void MiEventoClick(View v){
        Toast.makeText(RelativeLayoutDT.this, "HOla", Toast.LENGTH_SHORT).show();
    }
}

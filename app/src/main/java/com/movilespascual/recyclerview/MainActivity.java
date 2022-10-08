package com.movilespascual.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.AdapterView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<ListaElementos> elementos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }

    int[] idImagen = {
            R.drawable.icon_a,
            R.drawable.icon_f,
            R.drawable.icon_m,
            R.drawable.icon_o,
            R.drawable.icon_y,
    };

    public void  init(){
        elementos = new ArrayList<>();
        elementos.add(new ListaElementos("#5EABBE","Luis Mateo Tabares Perez","Japon","Activo",idImagen[2],"Soy yo","15:00"));
        elementos.add(new ListaElementos("#8FBE5E","Manuela Muñoz Naranjo","Korea","Activo",idImagen[2],"Tengo dolor de Cabeza","18:00"));
        elementos.add(new ListaElementos("#BE5E67","Andres Camilo Osorio Restrepo","Estados Unidos","Activo",idImagen[0],"Parce una Cochita","18:01"));
        elementos.add(new ListaElementos("#213213","Anderson Cardenas Quiceno","Colombia","Activo",idImagen[0],"Se putio Esto","14:30"));
        elementos.add(new ListaElementos("#432432","Omar de jesus Tabares Perez","Japon","Activo",idImagen[3],"Se me daño la moto","14:25"));
        elementos.add(new ListaElementos("#75BE5E","Yamile Arias Perez","Korea","Activo",idImagen[4],"Ayudame con una tarea","14:00"));
        elementos.add(new ListaElementos("#5EBE9F","Michi","Japon","Activo",idImagen[2],"...","13:00"));
        elementos.add(new ListaElementos("#6F5EBE","Firulais","Korea","Activo",idImagen[1],"...","14:00"));
        elementos.add(new ListaElementos("#BEB55E","Michi2","Japon","Activo",idImagen[2],"...","13:00"));
        elementos.add(new ListaElementos("#E71DE1","Firulais2","Korea","Activo",idImagen[1],"...","14:00"));
        elementos.add(new ListaElementos("#45E71D","Michi3","Japon","Activo",idImagen[2],"...","13:00"));
        elementos.add(new ListaElementos("#E71D1D","Firulais3","Korea","Activo",idImagen[1],"...","14:00"));


        ListAdapter listAdapter = new ListAdapter(elementos, this, new ListAdapter.OnItemClickListener() {
            @Override
            public void OnItemClick(ListaElementos item) {
                moveToDescription(item);
            }
        });
        RecyclerView recyclerView = findViewById(R.id.listRecyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(listAdapter);
    }

    public void moveToDescription(ListaElementos item) {
        Intent segunda = new Intent(MainActivity.this, UserActivity.class)
                .putExtra("elementos", item);
        startActivity(segunda);
    }


}
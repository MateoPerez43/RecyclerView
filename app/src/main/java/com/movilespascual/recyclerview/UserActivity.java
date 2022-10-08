package com.movilespascual.recyclerview;

import android.app.appsearch.GetByDocumentIdRequest;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class UserActivity extends AppCompatActivity {

    TextView nombreUsuario,ultimoMensaje,horaMensaje,pais,estado;
    ImageView iconimagen,iconImagenBack;
    String nombre,mensaje,lpais,lestado,hora,iconBack;
    int icon;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_activity);

        ListaElementos elementos = (ListaElementos) getIntent().getSerializableExtra("elementos");

        nombreUsuario = findViewById(R.id.nombrePersona);
        ultimoMensaje = findViewById(R.id.ultimoMensaje);
        horaMensaje = findViewById(R.id.horaMensaje);
        pais = findViewById(R.id.pais);
        estado = findViewById(R.id.estado);
        iconimagen = findViewById(R.id.iconoImageView);
        iconImagenBack = findViewById(R.id.iconoImageBack);


        nombre = elementos.getName();
        mensaje = elementos.getMensaje();
        hora = elementos.getHora();
        lpais = elementos.ciudad;
        icon = elementos.idImagen;
        iconBack = elementos.getColor();
        lestado = elementos.getEstado();

        nombreUsuario.setText(nombre);
        ultimoMensaje.setText(mensaje);
        horaMensaje.setText(hora);
        pais.setText(lpais);
        iconImagenBack.setColorFilter(Color.parseColor(iconBack), PorterDuff.Mode.SRC_IN);
        iconimagen.setImageResource(icon);
        estado.setText(lestado);



    }
}
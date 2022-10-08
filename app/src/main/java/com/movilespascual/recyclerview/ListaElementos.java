package com.movilespascual.recyclerview;
import java.io.Serializable;

public class ListaElementos implements Serializable {
    public  String color, name, ciudad, estado,mensaje,hora;
    public int idImagen;

    public ListaElementos(String color, String name, String ciudad, String estado,int idImagen,String mensaje,String hora) {
        this.color = color;
        this.name = name;
        this.ciudad = ciudad;
        this.estado = estado;
        this.idImagen = idImagen;
        this.mensaje = mensaje;
        this.hora = hora;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setIdImagen(int idImagen){this.idImagen = idImagen;}

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }
}

package com.example.recyclerviewpersonalizado;

public class Tarjetas_alumnos {
    private String nombre;
    private String cuenta;
    private int foto;

    public Tarjetas_alumnos(String nombre, String cuenta, int foto) {
        this.nombre = nombre;
        this.cuenta = cuenta;
        this.foto = foto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }
}

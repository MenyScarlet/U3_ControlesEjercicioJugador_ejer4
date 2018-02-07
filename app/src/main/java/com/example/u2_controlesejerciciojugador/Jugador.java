package com.example.u2_controlesejerciciojugador;

/**
 * Created by DIDACT on 07/02/2018.
 */

public class Jugador {

    //Atributos
    String nombre;
    int dorsal;
    String posicion;
    boolean tiempoMundial;

    //Constructor

    public Jugador(String nombre, int dorsal, String posicion, boolean tiempoMundial) {
        this.nombre = nombre;
        this.dorsal = dorsal;
        this.posicion = posicion;
        this.tiempoMundial = tiempoMundial;
    }

    //Getters & Setters


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public boolean isTiempoMundial() {
        return tiempoMundial;
    }

    public void setTiempoMundial(boolean tiempoMundial) {
        this.tiempoMundial = tiempoMundial;
    }
}

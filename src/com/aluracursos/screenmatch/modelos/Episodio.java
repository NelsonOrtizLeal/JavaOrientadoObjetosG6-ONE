package com.aluracursos.screenmatch.modelos;

import com.aluracursos.screenmatch.calculos.Clasificable;

public class Episodio implements Clasificable {
    private int numero;
    private String nombre;
    private Serie serie;
    private int totalReprducciones;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public int getClasificacion() {
        if(totalReprducciones > 100){
            return 5;
        }else{
            return 2;
        }
    }
}

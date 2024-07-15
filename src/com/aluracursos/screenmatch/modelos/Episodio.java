package com.aluracursos.screenmatch.modelos;

import com.aluracursos.screenmatch.calculos.Clasificable;

public class Episodio implements Clasificable {
    private int numero;
    private String nombre;
    private Serie serie;
    private int totalvisualizaciones;

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

    public void setTotalvisualizaciones(int totalvisualizaciones){
        this.totalvisualizaciones = totalvisualizaciones;
    }

    @Override
    public int getClasificacion() {
        if(totalvisualizaciones > 100){
            return 5;
        }else{
            return 2;
        }
    }
}

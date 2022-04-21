package com.company;

public class Profesor extends Persona{
    private Double nuevoSueldo;

    public Profesor(){
    }

    public void cambiarSueldo(double nuevoSueldo){
        this.nuevoSueldo = nuevoSueldo;
    }

    public String obtenerDatos(){
        return super.obtenerDatos() + " con sueldo  " + this.nuevoSueldo;

    }

}

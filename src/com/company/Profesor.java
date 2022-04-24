package com.company;

public class Profesor extends Persona{
    private Double nuevoSueldo;



    public void cambiarSueldo(double nuevoSueldo){
        this.nuevoSueldo = nuevoSueldo;
    }

    public String obtenerDatos(){
        return super.obtenerDatos() + " (PROFE CON SUELDO: " + this.nuevoSueldo + ")";

    }

}

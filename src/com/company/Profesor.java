package com.company;

public class Profesor extends Persona{
    private Double nuevoSueldo;



    public void cambiarSueldo(double nuevoSueldo) throws Exception{
        this.nuevoSueldo = nuevoSueldo;
        if (nuevoSueldo > 3000){
            throw new Exception("Tu sueldo no puede ser superior a 3000");
        }
        if (nuevoSueldo < 0){
            throw new Exception("No puedes colocar números negativos en el sueldo");

        }
    }

    public String obtenerDatos() throws Exception{
        return super.obtenerDatos() + " (PROFE CON SUELDO: " + this.nuevoSueldo + ")";

    }

}

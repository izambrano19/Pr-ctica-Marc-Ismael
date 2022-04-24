package com.company;

// Queremos que hereda de persona
public class Estudiant extends Persona{
    //Si aquí no hay nada, ya tiene lo que tiene la clase persona gracias a extends Persona

    private Double nota;



    public void ponerNota(double nota){
        this.nota = nota;

    }


    public String obtenerDatos(){
        // Quiero que me diga lo mismo que persona mas la nota
        if (nota < 0){
            System.out.print("La nota tiene que ser entre 0 y 10");
        }else if (nota > 10) {
            System.out.print("La nota tiene que ser entre 0 y 10");
        }else {
            System.out.print(super.obtenerDatos() + " (ESTUDIANTE con nota: " + nota + ")");
        }
        return "";
    }

    }





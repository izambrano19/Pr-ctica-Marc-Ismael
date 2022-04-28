package com.company;

// Queremos que hereda de persona
public class Estudiant extends Persona{
    //Si aquí no hay nada, ya tiene lo que tiene la clase persona gracias a extends Persona

    private Double nota;



    public void ponerNota(double nota) throws Exception{
        this.nota = nota;
        if (nota < 0 || nota > 10){
            throw new Exception("Tu nota debe estar entre 0 y 10");
        }
    }


    public String obtenerDatos() throws Exception{
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





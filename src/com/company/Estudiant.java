package com.company;

// Queremos que hereda de persona
public class Estudiant extends Persona{
    //Si aquí no hay nada, ya tiene lo que tiene la clase persona gracias a extends Persona

    private Double nota;



    public void ponerNota(double nota){
        this.nota = nota;

    }


    public String obtenerDatos() throws Exception{
        // Quiero que me diga lo mismo que persona mas la nota
        if (nota < 0){
            throw new Exception("Tu nota debe ser superior a 0");

        } else if (nota > 10) {
            throw new Exception("Tu nota debe ser inferior a 10");

        }
        return super.obtenerDatos() + " (ESTUDIANTE con nota: " + nota + ")";
    }

    }





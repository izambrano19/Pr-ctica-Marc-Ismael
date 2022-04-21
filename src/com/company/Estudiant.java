package com.company;

// Queremos que hereda de persona
public class Estudiant extends Persona{
    //Si aquí no hay nada, ya tiene lo que tiene la clase persona gracias a extends Persona

    private Double nota;

    public Estudiant(){
    }

    public void ponerNota(double nota){


        if(nota >10){
            System.out.println("ERROR");
        }

        if(nota<0){
            System.out.println("ERROR");
        }else{
            this.nota = nota;
        }
    }


    public String obtenerDatos(){
        // Quiero que me diga lo mismo que persona mas la nota

        return super.obtenerDatos() + " y tu nota es " + this.nota;

    }



}

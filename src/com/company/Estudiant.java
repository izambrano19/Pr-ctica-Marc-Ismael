package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// Queremos que hereda de persona
public class Estudiant extends Persona{
    //Si aquí no hay nada, ya tiene lo que tiene la clase persona gracias a extends Persona
    private Double nMayor = 0.0;
    private Double nMenor = 11.0;


    private List<Double> notas = new ArrayList<>();

    public void ponerNota(double nota) throws Exception {




        if (nota < 0){
            throw new Exception("Tu nota debe ser superior a 0");
        } else if (nota > 10) {
            throw new Exception("Tu nota debe ser inferior a 10");
        }

        this.notas.add(nota);
        double n;

        for (int i = 1; i <= notas.size(); i++){
            n = notas.size();
            if (nMayor < n){
                nMayor = n;
            }
            if (nMenor > n){
                nMenor = n;
            }

        }
        System.out.println("Numero Mayor: " + nMayor);
        System.out.println("Numero Menor: " + nMenor);







    }


    public String obtenerDatos() throws Exception{
        // Quiero que me diga lo mismo que persona mas la nota

        return super.obtenerDatos() + " (ESTUDIANTE con nota: " + notas + ")";
    }

    }





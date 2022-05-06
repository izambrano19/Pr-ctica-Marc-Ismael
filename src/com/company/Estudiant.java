package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// Queremos que hereda de persona
public class Estudiant extends Persona{
    //Si aquí no hay nada, ya tiene lo que tiene la clase persona gracias a extends Persona

    private List<Double> notas = new ArrayList<Double>();

    public void ponerNota(double nota) throws Exception {

        if (nota < 0){
            throw new Exception("Tu nota debe ser superior a 0");
        } else if (nota > 10) {
            throw new Exception("Tu nota debe ser inferior a 10");
        }
        this.notas.add(nota);

    }


    public String obtenerDatos() throws Exception{

        double min = 0;
        double max = 0;
        double sumNotas = 0;
        double media = 0;

        for(double n: notas){
            sumNotas = sumNotas + n;
            media = sumNotas / notas.size();
            if (min == 0 && max == 0){
                min = n;
                max = n;
            }
            if (max < n){
                max = n;
            }
            if (min > n){
                min = n;
            }
        }

        // Quiero que me diga lo mismo que persona mas la nota
        return super.obtenerDatos() + " (ESTUDIANTE: - nota maxima: " + max + " nota minima: " + min + " y la media es: " + media + " y todas las notas:" + notas + ")";
    }

    }





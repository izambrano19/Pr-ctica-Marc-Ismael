package com.company;

import java.util.ArrayList;
import java.util.List;


public class Instituto {
    private String nom;
    List<Persona> personas = new ArrayList<>();

    public void nom(String nom){
        this.nom = nom;
    }

    public void agregarProfe(Profesor profe){
        this.personas.add(profe);
    }

    public void agregarEstudiante(Estudiant estudiante){
        this.personas.add(estudiante);
    }
    public void imprimirInformacion() throws Exception{
        System.out.println("El instituto " + this.nom);
        for (Persona p : personas) {
            System.out.println(p.obtenerDatos());
        }
    }

}

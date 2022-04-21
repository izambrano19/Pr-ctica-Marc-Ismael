package com.company;

import java.util.ArrayList;
import java.util.List;

public class Instituto {
    private String nom;
    private String profe;
    private String estudiante;
    List<Persona> personas = new ArrayList<Persona>();



    public Instituto(){

    }

    public void nom(String nom){
        this.nom = nom;
    }

    public void agregarProfe(Profesor profe){
        this.personas.add(profe);
    }

    public void agregarEstudiante(Estudiant estudiante){
        this.personas.add(estudiante);
    }

    public String imprimirInformacion(){
        return "El instituto " + this.nom + " ,el nombre del profesor es " + this.profe + " y el nombre del estudiante es " + this.estudiante;
    }
}

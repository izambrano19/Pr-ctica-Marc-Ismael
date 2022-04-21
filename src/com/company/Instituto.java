package com.company;

public class Instituto {
    private String nom;
    private String profe;
    private String estudiante;


    public Instituto(){

    }

    public void nom(String nom){
        this.nom = nom;
    }

    public void agregarProfe(String profe){
        this.profe = profe;
    }

    public void agregarEstudiante(String estudiante){
        this.estudiante = estudiante;
    }
    public String imprimirInformacion(){
        return "El instituto " + this.nom + " ,el nombre del profesor es " + this.profe + " y el nombre del estudiante es " + this.estudiante;
    }
}

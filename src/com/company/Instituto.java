package com.company;

public class Instituto {
    private String nom;
    private String profe;


    public Instituto(){

    }

    public void nomProfe(String nom){
        this.nom = nom;
    }

    public void agregarProfe(String profe){
        this.profe = profe;
    }
    public String obtenerDatos(){
        return "Persona que se llama " + this.nom + " " + this.profe;
    }
}

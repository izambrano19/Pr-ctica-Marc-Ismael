package com.company;

public class Persona {
    //Atributos (Siempre privados)
    private String nom;
    private String dni;

    //Funciones (Pueden ser públicas o privadas)
    public Persona(){
        //Constructora
        //System.out.println("hola");
    }

    //Esta función cambia el nombre de la persona
    public void cambiarNombre(String nom){
        this.nom = nom; //Cuando usas el this, lo busca adentro, en este caso this.nom es el nom de aquí, y el nom a secas es otro

    }

    public void asignarDni(String dni){
        this.dni = dni;
    }

    //Función que devuelva el nombre y el dni de la persona
    public String obtenerDatos(){
        return "Persona que se llama " + this.nom + " con dni " + this.dni;
    }




}

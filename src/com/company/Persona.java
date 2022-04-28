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
    public void asignarDni(String dni) throws Exception{
        this.dni = dni;
        if(dni==null){
            throw new Exception("Ya has introducido tu dni anteriormente");
        }
    }

    //Función que devuelva el nombre y el dni de la persona
    public String obtenerDatos() throws Exception{
        if(dni.isEmpty()){
            throw new Exception("El dni esta vacio");
        }
        if(nom.isEmpty()){
            throw new Exception("El nombre esta vacio");
        }


        return "Persona con nombre " + this.nom + " y DNI " + this.dni;
    }




}

package com.company;



public class ProfesorSustituto extends Profesor{
    private String dataInicio;
    private String dataFinal;

    public ProfesorSustituto(){
    }
    public void asignarSustitucion(String dataInicio, String dataFinal){
        this.dataInicio = dataInicio;
        this.dataFinal = dataFinal;
    }

    public String obtenerDatos(){
        return super.obtenerDatos() + " , la fecha de inicio es" + this.dataInicio + " y tu fecha de salida es " + this.dataFinal;

    }





}

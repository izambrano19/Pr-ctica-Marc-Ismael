package com.company;


import java.util.Date;

public class ProfesorSustituto extends Profesor{
    private Date dataInicio;
    private Date dataFinal;



    public ProfesorSustituto(){
    }
    public void asignarSustitucion(Date dataInicio, Date dataFinal){
        this.dataInicio = dataInicio;
        this.dataFinal = dataFinal;
    }

    public String obtenerDatos(){
        return super.obtenerDatos() + " , la fecha de inicio es " + dataInicio.getDay() + "/" + dataInicio.getMonth() + "/" + dataInicio.getYear() + " y tu fecha de salida es " + dataFinal.getDay() + "/" + dataFinal.getMonth() + "/" + dataFinal.getYear();

    }


}

package com.company;

import java.rmi.server.ExportException;
import java.util.Date;

public class Main {

    public static void main(String[] args) throws Exception{
        Persona p1 = new Persona(); //Instancia de persona
        Estudiant e = new Estudiant();
        Profesor p = new Profesor();
        ProfesorSustituto ps = new ProfesorSustituto();
        Instituto ins = new Instituto();

        p1.cambiarNombre("Isma");
        p1.asignarDni("123456789");
        String datos = p1.obtenerDatos();
        System.out.println(datos);

        //Estudiante
        e.cambiarNombre("Isaac");
        e.asignarDni("123456789");
        e.ponerNota(7);
        e.ponerNota(5);
        e.ponerNota(3);
        e.ponerNota(9);
        e.ponerNota(1);
        datos = e.obtenerDatos();
        System.out.println(datos);

        //Profesor
        System.out.print("\n");
        p.cambiarNombre("Profe Marc");
        p.asignarDni("111111111");
        p.cambiarSueldo(2500);
        datos = p.obtenerDatos();
        System.out.println(datos);

        //Profesor Sustituto
        System.out.print("\n");
        ps.cambiarNombre("Profe Marc sustituto");
        ps.asignarDni("123456789");
        ps.cambiarSueldo(2700);

        Date dataInicio = new Date(2022,04,15);
        Date dataFinal = new Date(2022,04,16);
        ps.asignarSustitucion(dataInicio,dataFinal);
        datos = ps.obtenerDatos();
        System.out.println(datos);

        //Instituto
        System.out.print("\n");
        ins.nom("La Guineueta");
        ins.agregar(p);
        ins.agregar(ps);
        ins.agregar(e);
        ins.imprimirInformacion();
    }
}

package com.company;

public class Main {

    public static void main(String[] args) {
        Persona p1 = new Persona(); //Instancia de persona
        Persona p2 = new Persona();
        Estudiant e = new Estudiant();
        Profesor p = new Profesor();
        ProfesorSustituto ps = new ProfesorSustituto();
        Instituto ins = new Instituto();

        p1.cambiarNombre("Isma");
        p1.asignarDni("12345678");
        String datos = p1.obtenerDatos();
        System.out.println(datos);

        p2.cambiarNombre("Joan");
        p2.asignarDni("01035");
        datos = p2.obtenerDatos();
        System.out.println(datos);

        //Estudiante
        e.cambiarNombre("Isaac");
        e.asignarDni("23423");
        e.ponerNota(9.9);
        datos = e.obtenerDatos();
        System.out.println(datos);

        //Profesor
        p.cambiarNombre("Profe Marc");
        p.asignarDni("111111111");
        p.cambiarSueldo(6800.5);
        datos = p.obtenerDatos();
        System.out.println(datos);

        //Profesor Sustituo
        ps.cambiarNombre("Profe Marc sustituto");
        ps.asignarDni("99999999");
        ps.cambiarSueldo(6800.5);
        ps.asignarSustitucion("01/05/2022","03/05/2022");
        datos = ps.obtenerDatos();
        System.out.println(datos);

        //Instituto
        ins.nomProfe("Pepito");
        ins.agregarProfe("Profe Marc");
        datos = ins.obtenerDatos();
        System.out.println(datos);

    }
}

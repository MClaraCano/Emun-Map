package org.example.enumer;

public class Main {
    public static void main(String[] args) {
        System.out.println("");
        System.out.println("Andanding");
        System.out.println("");

        System.out.println("-- Demarcación --");

        Demarcacion delantero = Demarcacion.DELANTERO;
        Demarcacion portero = Demarcacion.PORTERO;
        Demarcacion defensa = Demarcacion.DEFENSA;

        System.out.println(delantero.name());
        System.out.println(delantero.toString());
        System.out.println("pos delantero: " + delantero.ordinal());
        System.out.println("pos portero: " + portero.ordinal());

        //compareTo compara la diferencia entre ambos índices,
        //siendo el inicial, el que está como argumento
        System.out.println("delantero a portero: " + delantero.compareTo(portero));

        System.out.println(Demarcacion.values().toString());

        System.out.println("");
        System.out.println("-- Equipo --");

        Equipo barza = Equipo.BARZA;
        Equipo sevilla = Equipo.SEVILLA;

        System.out.println(barza.name());
        System.out.println(barza.toString());
        System.out.println("pos barza: " + barza.ordinal());
        System.out.println("pos sevilla: " + sevilla.ordinal());
        System.out.println("barza a sevilla: " + barza.compareTo(sevilla));

        System.out.println(Equipo.values());
        System.out.println("");

        for (Equipo equipito : Equipo.values()) {
            System.out.println("Nombre equipo: " + equipito.toString() + " | Puesto: " + equipito.getPuesto());
        }

        System.out.println("");
        System.out.println("Nombre de BARZA: " + barza.getNombre());
        System.out.println("Nombre de BARZA desde Equipo: " + Equipo.BARZA.getNombre());

        //se pueden cambiar los argumentos, pero NO SE DEBERIA
        Equipo.BARZA.setNombre("barcito");
        System.out.println(Equipo.BARZA.getNombre());

    }
}
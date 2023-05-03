package org.example.practica;

import org.example.practica.enums.Club;
import org.example.practica.enums.Posicion;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class practica {
    public static void main(String[] args) {

        //creamos el map de posicionesEnLigas (lo necesitamos para crear el Equipo, ya que es un argumento)
        Map<String, Integer> posicionesEnLigas = new HashMap<>();
        posicionesEnLigas.put("LFP", 2);
        posicionesEnLigas.put("Copa Sudamericana", 1);
        posicionesEnLigas.put("Copa Libertadores", 3);

        //Creamos el Equipo
        Equipo equipo1 = new Equipo(Club.RIVER, posicionesEnLigas);

        //creamos los jugadores
        Jugador jugador1 = new Jugador("Federico", 1, equipo1, Posicion.ARQUERO);
        Jugador jugador2 = new Jugador("Claudio", 11, equipo1, Posicion.DEFENSOR);
        Jugador jugador3 = new Jugador("Axel", 9, equipo1, Posicion.DELANTERO);
        Jugador jugador4 = new Jugador("Bruno", 13, equipo1, Posicion.MEDIOCAMPISTA);

        //agregamos los jugadores al equipo
        equipo1.agregarJugador(jugador1);
        equipo1.agregarJugador(jugador2);
        equipo1.agregarJugador(jugador3);
        equipo1.agregarJugador(jugador4);

        System.out.println("Los jugadores de " + equipo1.getNombreEquipo() +" fueron:");

        Iterator<Integer> it = equipo1.getJugadores().keySet().iterator();


        while (it.hasNext()){
            Integer key = it.next();
            System.out.println("Camiseta N°: " + key + " | Jugador: " + equipo1.getJugadores().get(key));
        }

        Iterator<String> it2 = equipo1.getPosicionesEnLigas().keySet().iterator();

        while (it2.hasNext()){
            String key = it2.next();
            System.out.println("Del campeonato " + key + ", " + equipo1.nombreEquipo + " tiene ganados: " + equipo1.getPosicionesEnLigas().get(key));
        }




    }
}

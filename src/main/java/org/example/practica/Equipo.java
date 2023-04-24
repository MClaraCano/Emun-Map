package org.example.practica;

import org.example.practica.enums.Club;

import java.util.HashMap;
import java.util.Map;

public class Equipo {

    Map<Integer, String> jugadores;

    Club nombreEquipo;

    Map<String, Integer> posicionesEnLigas;



    public Equipo(Club nombreEquipo, Map<String, Integer> posicionesEnLigas) {
        this.nombreEquipo = nombreEquipo;
        this.posicionesEnLigas = posicionesEnLigas;
        this.jugadores = new HashMap<>();
    }

    public Map<Integer, String> getJugadores() {
        return jugadores;
    }

    public void setJugadores(Map<Integer, String> jugadores) {
        this.jugadores = jugadores;
    }

    public Club getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(Club nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public Map<String, Integer> getPosicionesEnLigas() {
        return posicionesEnLigas;
    }

    public void setPosicionesEnLigas(Map<String, Integer> posicionesEnLigas) {
        this.posicionesEnLigas = posicionesEnLigas;
    }





    public void agregarJugador(Jugador jugador){
        jugadores.put(jugador.getNro_camiseta(), jugador.getNombre());
    }
}

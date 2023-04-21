package org.example.enumer;

public enum Equipo {
    BARZA("FC Barza", 1), REAL_MADRID("Real Madrid", 2),
    SEVILLA("Sevilla FC",4), VILLAREAL("Villareal", 7);

    private String nombre;
    private int puesto;

    private Equipo(String nombre, int puesto){
        this.nombre = nombre;
        this.puesto = puesto;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPuesto() {
        return puesto;
    }
}

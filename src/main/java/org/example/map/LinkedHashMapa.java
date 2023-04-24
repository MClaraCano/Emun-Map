package org.example.map;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class LinkedHashMapa {
    public static void main(String[] args) {

        Map<Integer, String> map = new LinkedHashMap<>();

        map.put(1, "Casillas");
        map.put(25, "Alguno");
        map.put(3, "Pique");
        map.put(11, "Capdevilla");
        map.put(8, "Queotro");
        map.put(16, "Busquets");
        map.put(18, "Pedrito");

        //Imprimimos el Map con un Iterator
        //NO se usa el new
        Iterator it = map.keySet().iterator();


        while (it.hasNext()) {
            Integer clave = (Integer) it.next();
            System.out.println("Clave: " + clave + "-> Valor: " +
                    map.get(clave));
        }


        //con Entry, porq Map no implemrnta Collection y debe hacerse así
        System.out.println("Foreach: Forma de recorrer Map mostrando clave y valor");

        for ( Map.Entry<Integer, String> jugador: map.entrySet()) {
            Integer clave = jugador.getKey();
            String valor = jugador.getValue();
            System.out.println("Clave: " + clave + " | Valor: " + valor);
        }
    }
}

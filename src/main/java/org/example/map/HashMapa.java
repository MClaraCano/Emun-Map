package org.example.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapa {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<Integer, String>();

        map.put(1, "Casillas");
        map.put(25, "Alguno");
        map.put(3, "Pique");
        map.put(11, "Capdevilla");
        map.put(8, "Queotro");
        map.put(16, "Busquets");
        map.put(18, "Pedrito");

        //Imprimimos el Map con un Iterator
        //NO se usa el new
        Iterator<Integer> it = map.keySet().iterator();


        while (it.hasNext()) {
            Integer clave = it.next();
            System.out.println("Clave: " + clave + "-> Valor: " +
                    map.get(clave));
        }

    }

}


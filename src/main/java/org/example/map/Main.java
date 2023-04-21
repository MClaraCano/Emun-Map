package org.example.map;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<Integer, String> primerMapa = new HashMap<>();

        System.out.println("¿Está vacío?: " + primerMapa.isEmpty());
        System.out.println("Tamaño: " + primerMapa.size());

        primerMapa.put(34, "Clara");
        primerMapa.put(27, "Fran");
        primerMapa.put(4, "Bee");

        System.out.println("");
        System.out.println("¿Está vacío?: " + primerMapa.isEmpty());
        System.out.println("Tamaño: " + primerMapa.size());

        System.out.println("");

        System.out.println("Nombre de persona con 34 años: " + primerMapa.get(34));
        primerMapa.remove(34);
        System.out.println("Después de remove(34) - Tamaño: " + primerMapa.size());
        System.out.println("¿Contiene la clave 27?: " + primerMapa.containsKey(27));
        System.out.println("¿Contiene el valor Clara?: " + primerMapa.containsValue("Clara"));
        System.out.println("Valores del map: " + primerMapa.values());
        primerMapa.clear();
        System.out.println("¿Está vacío? - Después de clear(): " + primerMapa.isEmpty());


        /* ITERADORES con Map
        Para recorrer los maps, y poder trabajar con ellos. 3 métodos:

        hasnext() - para saber si quedan elementos
        next() - nos da el siguiente elemento
        remove() - elimina elemento

        Clases más importantes de la interfaz MAP:
        (Dif principal: orden en que guardan los valores)

        - HashMap:
                Elementos sin orden específico.
                No aceptan claves duplicadas ni valores nulos
        - TreeMap:
                Ordena de manera "natural": Menor a mayor, alfabéticamente, etc.
        - LinkedHashMap:
                Orden en que se van insertando (más lento que otras clases)

        */

        System.out.println();
        System.out.println();


    }
}

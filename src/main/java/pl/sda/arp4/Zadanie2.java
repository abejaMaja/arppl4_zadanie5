package pl.sda.arp4;

import java.util.*;

public class Zadanie2 {
    public static void main(String []args){

        List<Integer> lista = new ArrayList<>();
        Random generator = new Random(3);

        int suma = 0;
        for (int i =0; i < 11; i++){
            (lista).add(generator.nextInt(3));
            suma+= (lista).get(i);
        }

        System.out.println(lista);
        System.out.println(suma);
        System.out.println(suma/11.0);

        Collections.sort(lista);
        System.out.println(lista);
        System.out.println(lista.get(11/2));
        System.out.println((lista).indexOf(1));

        int maxElement = lista.get(0);
        for (int i = 0; i < lista.size(); i++) {
            if (maxElement < lista.get(i)) {
                maxElement = lista.get(i);
            }
        }

        int minElement = lista.get(0);
        for (int i = 0; i < lista.size(); i++) {
            if (minElement > lista.get(i)) {
                minElement = lista.get(i);
            }
        }

        System.out.println("maxElement " + maxElement );
        System.out.println("maxElement " + minElement );

    }
}

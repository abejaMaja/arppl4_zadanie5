package pl.sda.arp4;

import java.util.ArrayList;
import java.util.Arrays;

public class Zadanie3 {
    public static void main(String []args) {

        ArrayList<String> lista = new ArrayList<>(Arrays.asList("10030", "3004", "4000", "12355", "12222", "67888"));

        System.out.println(lista.indexOf("138751"));
        System.out.println(lista.contains("67888"));
        System.out.println(lista.remove("67888"));
        System.out.println(lista.contains("67888"));

        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
            System.out.println("------------------------------");


        }

        for (int i = 0; i < lista.size(); i++) {

            System.out.print(lista.get(i) + ", ");


        }
    }
}

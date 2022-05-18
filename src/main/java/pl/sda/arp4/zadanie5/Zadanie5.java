package pl.sda.arp4.zadanie5;

import pl.sda.arp4.Sex;

import java.util.ArrayList;
import java.util.List;

public class Zadanie5 {
    public static void main(String[] args) {
        List<Student5> lista = new ArrayList<>();
        Sex kobieta = Sex.KOBIETA;
        Sex mezczyzna = Sex.MEZCZYZNA;
        Student5 student1 = new Student5("123", "Maja", "Kowalska", kobieta);
        Student5 student2 = new Student5("1234", "Kasia", "Nowak", kobieta);
        Student5 student3 = new Student5("456", "Tomek", "Kowalska", mezczyzna);
        Student5 student4 = new Student5("890", "Jan", "Nowak", mezczyzna);
        lista.add(student1);
        lista.add(student2);
        lista.add(student3);
        lista.add(student4);
        System.out.println("Lista w lini, zwykły print " + lista);
        System.out.println("Iteracja po forach: ");
        for (Student5 student5 : lista) {
            System.out.println(student5);
        }
        System.out.println("##########################");
        for (int i = 0; i < lista.size(); i++) {
            Sex sex = lista.get(i).sex;
            if (sex.equals(kobieta)){
                System.out.println("Tylko kobiety " + lista.get(i));
                System.out.println("##########################");
            } else if (sex.equals(mezczyzna)) {
                System.out.println("Tylko mezczyzni " + lista.get(i));
                System.out.println("--------------------------");
            }

        }

        for (int i = 0; i < lista.size(); i++) {
            String idx = lista.get(i).numerIdx;
            System.out.println("Numery indeksów :" + idx);
        }

    }
}

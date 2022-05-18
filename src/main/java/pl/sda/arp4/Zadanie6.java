package pl.sda.arp4;

import java.util.Scanner;

public class Zadanie6 {
    public static void main(String[] args) {
        Dziennik dziennik = new Dziennik();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Tu dziennik elektroniczny, napisz co chcesz zrobić (dodaj, usun, wypisz: ");
        String komenda;
        do {
            System.out.println("podaj komendę");
            komenda = scanner.next();

            if(komenda.equals("dodaj")){
                System.out.println("Podaj imie: ");
                String imie = scanner.next();

                System.out.println("Podaj nazwisko: ");
                String nazwisko = scanner.next();

                System.out.println("Podaj numer indeksu: ");
                String numerIndeksu = scanner.next();

                Student nowyStudent = new Student(numerIndeksu, imie, nazwisko);
                dziennik.dodajStudenta(nowyStudent);
            } else if (komenda.equals("wypisz")) {
                dziennik.wypisz();
            } else if (komenda.equals("usuń")) {
                System.out.println("podaj numer indeksu ");
                String numerIndeksu = scanner.next();
                dziennik.usunStudenta(numerIndeksu);

            } else if (komenda.equals("zwroc")) {
                System.out.println("podaj numer indeksu ");
                String numerIndeksu = scanner.next();
                try {
                    Student student = dziennik.zwrocStudent(numerIndeksu);
                    System.out.println(student);
                } catch (BrakStudentaException e) {
                    System.err.println("Nie znaleziono studenta ");;
                }

            }


        }while (!komenda.equalsIgnoreCase("koniec"));
    }
}

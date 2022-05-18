package pl.sda.arp4;

public class BrakStudentaException extends Exception{
    public BrakStudentaException(String numerIndeksu) {
        super("nie znaleziono studenta o numerze indeksu " + numerIndeksu);
    }
}

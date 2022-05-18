package pl.sda.arp4;

public class BrakOcenException extends RuntimeException{
    public BrakOcenException() {
        super("Brak ocen w dzienniczku");
    }
}

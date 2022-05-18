package pl.sda.arp4;

import junit.framework.TestCase;
import org.junit.Test;

public class DziennikTest extends TestCase {

    @Test
    public void test_zwrocStudenta(){
        Dziennik dziennik = new Dziennik();
        try {
            dziennik.zwrocStudent("123");
        } catch (BrakStudentaException e) {
            System.out.println("Cos nie tak");;
        }
    }

}
package kolekcje;

import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class Mapa {

    Map<Integer,String> dziennik = new HashMap<Integer, String>();

    public void tworzeDziennik(){
        dziennik.put(1, "Kowalski");
        dziennik.put(2, "Nowak");
        dziennik.put(3, "Cimoszewicz");
        dziennik.put(4, "Strong");
    }

    @Test
    public void testMapy(){
        tworzeDziennik();
        System.out.println(dziennik.size());
        dziennik.put(5, "Jastrząb");
        dziennik.remove(2);
        System.out.println(dziennik.size());
        System.out.println(dziennik.containsKey(2));
        System.out.println(dziennik.containsKey(4));
    }
}

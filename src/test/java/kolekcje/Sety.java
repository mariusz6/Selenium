package kolekcje;


import org.testng.annotations.Test;

import java.util.HashSet;
import java.util.Set;

public class Sety {

    Set<String> nicks = new HashSet<String>();

    public void dodajemyNicksy(){
        nicks.add("Mokry Jan");
        nicks.add("Strugany Bury");
        nicks.add("Maja Drewno");
    }

    @Test

    public void testujemyNicky(){
        dodajemyNicksy();
        System.out.println(nicks.size());
        System.out.println(nicks.contains("Mokry Jan"));
        nicks.remove("Maja Drewno");
        System.out.println(nicks.size());
        nicks.add("Jan Klos");
        System.out.println(nicks.size());
    }
}

package kolekcje;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Lista {

    List<String> imiona = new ArrayList<String>();

    List<Integer> numery = new LinkedList<Integer>();

    public void dodajImiona(){
        imiona.add("Mieszko");
        imiona.add("Zbyszko");
        imiona.add("Kazimierz");
    }

    public void dodajNumeryLotto(){
        numery.add(2);
        numery.add(43);
        numery.add(24);
        numery.add(2234);
        numery.add(233);
        numery.add(221);
    }



    @Test
    public void testLista(){
        dodajImiona();
        System.out.println(imiona.get(0));
        System.out.println(imiona.size());
        imiona.remove("Mieszko");
        System.out.println(imiona.size());
        System.out.println(imiona.indexOf("Zbyszko"));
        System.out.println(imiona.contains("Kazimierz"));
    }

    @Test
    public void testLinkedLista(){
        dodajNumeryLotto();
        System.out.println(numery.get(0));
        System.out.println(numery.contains(2));
        System.out.println(numery.size());
        System.out.println(numery.remove(1));
        System.out.println(numery.size());
    }
}

package dziedziczenie;

public class Dziecko extends Rodzic{

    protected String kolorOczu = "szmargdowy";

    public void wypiszMojKolorOczu(){
        System.out.println("Moj kolor oczu " + kolorOczu);
    }
    public void wypiszKolorWlosow(){
        System.out.println("Moj kolor wlosow" + kolorWlosow);
    }

    public void wypiszSklonDo(){
        System.out.println("Moja skl do tycia" + sklonnoscDotycia);
    }
}

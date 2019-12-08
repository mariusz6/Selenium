package dziedziczenie;

import org.testng.annotations.Test;

public class testDziedziczenia {
    @Test
    public void testDziedziczenia(){
        Dziecko dziecko = new Dziecko();
        dziecko.wypiszMojKolorOczu();
        dziecko.wypiszKolorWlosow();
        dziecko.wypiszSklonDo();
        if (dziecko.sklonnoscDotycia){
            System.out.println("Mam sklonnosci do tycia");
    }
    }
}

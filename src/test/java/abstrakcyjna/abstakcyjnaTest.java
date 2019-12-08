package abstrakcyjna;

import org.testng.annotations.Test;

public class abstakcyjnaTest {

    @Test
    public void testKlasyAbstrakcyjnej(){

        Pies reksio = new Pies();
        reksio.poruszajSie();
        reksio.wypiszPrzysmak();
        System.out.println(reksio.gatunek);

        Ptak twety = new Ptak();
        twety.wypiszPrzysmak();
        twety.poruszajSie();
        System.out.println(twety.gatunek);
    }
}

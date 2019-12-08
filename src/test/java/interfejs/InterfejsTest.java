package interfejs;

import org.testng.annotations.Test;

public class InterfejsTest {

    @Test
    public void interfejsTest(){
        Auto premiumAuto = new PremiumAuto();
        zaprezentujAuto(premiumAuto);

        Auto podstawoweAuto = new PodstawoweAuto();
        zaprezentujAuto(podstawoweAuto);

    }

    public void zaprezentujAuto(Auto kupa){
        kupa.zmienBieg();
        kupa.jedz();

    }



    }


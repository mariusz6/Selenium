import org.testng.annotations.Test;

public class OperatoryMatematyczne   {

        @Test
        public void testOperatory(){
            int pierwszaLiczba=5;
            int drugaLiczba =2;

            int suma = pierwszaLiczba + drugaLiczba;

            int roznica = pierwszaLiczba - drugaLiczba;

            int iloczyn = pierwszaLiczba/drugaLiczba;

            System.out.println(suma);
            System.out.println(roznica);
            System.out.println(iloczyn);
        }
    }


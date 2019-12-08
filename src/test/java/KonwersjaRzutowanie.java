import org.testng.annotations.Test;


public class KonwersjaRzutowanie {


    public int suma() {
        int a = 2;
        int b = 3;
        return a + b;
    }

    int wynik = suma();


    public Student pobierzDaneStudenta() {
        Student student = new Student("Jan", "Bykow", "IN");
        student.przedstawSie();
        return student;
    }

    public int suma (int pierwszaLiczba, int drugaLiczba){
        return pierwszaLiczba + drugaLiczba;
    }

    public void przywitajSie(String imie){
        System.out.println("witaj" +imie);
    }
@Test
    public void testMetod(){
        Student student = pobierzDaneStudenta();
        przywitajSie("mariusz");

    System.out.println(suma(3,4));
    }


}
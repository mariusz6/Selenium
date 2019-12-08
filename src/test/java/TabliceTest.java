import org.testng.annotations.Test;

public class TabliceTest {

    @Test
    public void TestTablic(){

        Tablice tablice = new Tablice();
        tablice.ustawWartosc();
        tablice.wypiszElementyTablicy();

        tablice.dodajStudenta();
        tablice.przedstawStudentow();
    }

}

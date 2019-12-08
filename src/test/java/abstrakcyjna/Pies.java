package abstrakcyjna;

public class Pies extends Zwierzatko {
    @Override
    public void poruszajSie() {
        System.out.println("Biegam i merdam");
    }

    @Override
    public void wypiszPrzysmak() {
        System.out.println("Lubie kosci");
    }
}

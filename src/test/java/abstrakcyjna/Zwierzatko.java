package abstrakcyjna;

public abstract class Zwierzatko {

    public String gatunek = "ssak";
    public abstract void poruszajSie();
    public abstract void wypiszPrzysmak();
    public void napijSieWody(){
        System.out.println("Pije wode");
    }
}

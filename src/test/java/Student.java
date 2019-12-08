public class Student {

    public String imie;
    public String nazwisko;
    public String grupa;

    public void przedstawSie(){
        System.out.println("Cześć! Nazywam się " + imie + " " + nazwisko);

    }
    public Student (String noweImię, String noweNazwisko, String nowaGrupa){
        imie = noweImię;
        nazwisko = noweNazwisko;
        grupa = nowaGrupa;
    }
}

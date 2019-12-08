public class Tablice {

    int liczby[] = new int[5];

    public void ustawWartosc() {
        liczby[0] = 1;
        liczby[1] = 32;
        liczby[2] = 321;
        liczby[3] = 1233;
        liczby[4] = 1313;
    }

    public void wypiszElementyTablicy() {
        for (int i = 0; i < liczby.length; i++) {
            System.out.println(liczby[i]);
        }
    }

    Student studenci[] = new Student[2];

    public void dodajStudenta() {
        Student pierwszy = new Student("Jonasz", "Ktoś", "I");
        Student drugi = new Student("Mieszko", "Merkury", "II");

        studenci[0] = pierwszy;
        studenci[1] = drugi;
    }
    public void przedstawStudentow(){
        studenci[0].przedstawSie();
        studenci[1].przedstawSie();
    }
}

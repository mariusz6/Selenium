package interfejs;

public class PodstawoweAuto implements Auto{

    private String model="Tipo";
    private String marka="Fiat";

    public void toJestMetodaSpecyficzna(){
        System.out.println("To jest metoda dla auta w wersji podstawowej" + model);
    }
    @Override
    public void jedz() {
        System.out.println("Jedź podstawowym autem");
    }

    @Override
    public void zatrzymaj() {
        System.out.println("Zatrzymaj podstawowe auto");
    }

    @Override
    public void otworzSzybe() {
        System.out.println("Otwórz szybę w podsawowym aucie");
    }

    @Override
    public void zmienBieg() {
        System.out.println("Zmień bieg w podstawowym aucie");
    }
}

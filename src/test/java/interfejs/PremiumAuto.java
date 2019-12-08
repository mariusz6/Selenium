package interfejs;

public class PremiumAuto implements Auto {

    public void toJestSpecyficznaMetodaPremium(){
        System.out.println("To jest specyficzny tekst premium");
    }

    @Override
    public void jedz() {
        System.out.println("Jedź premium autem");
    }

    @Override
    public void zatrzymaj() {
        System.out.println("Zatrzymaj premium auto");
    }

    @Override
    public void otworzSzybe() {
        System.out.println("Otwórz szybę w premium aucie");
    }

    @Override
    public void zmienBieg() {
        System.out.println("Zmień bieg w premium aucie");
    }
}

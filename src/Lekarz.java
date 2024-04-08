import java.util.ArrayList;

public class Lekarz {
    private String imie;
    private String nazwisko;
    ArrayList<Object> Lista_leczonych_pacjentow = new ArrayList<>();

    public Lekarz(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public ArrayList<Object> getLista_leczonych_pacjentow() {
        return Lista_leczonych_pacjentow;
    }
    public void Dodajpacjenta(Pacjent pacjent){
        Lista_leczonych_pacjentow.add(pacjent);
    }
}

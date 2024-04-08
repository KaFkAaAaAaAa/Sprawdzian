import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Choroba kila = new Choroba("Kiła");
        kila.setStopien_smiertelnosci(2);

        Choroba fomo = new Choroba("FOMO");
        fomo.setStopien_smiertelnosci(10);

        Choroba zapaleniePłuc = new Choroba("Zapalenie płuc");
        zapaleniePłuc.setStopien_smiertelnosci(4);

        Pacjent orzel = new Pacjent("Orzeł", "Kaktusowski", LocalDate.now(), kila);
        Pacjent michu = new Pacjent("Michu", "Śliwa", LocalDate.now(), fomo);
        Pacjent olivier = new Pacjent("Olivier", "Szabla", LocalDate.now(), zapaleniePłuc);

        Lekarz lekarz1 = new Lekarz("Krystian", "Horda");
        lekarz1.Dodajpacjenta(orzel);

        Lekarz lekarz2 = new Lekarz("Tymon", "Wróżący");
        lekarz2.Dodajpacjenta(michu);

        Lekarz lekarz3 = new Lekarz("Wojtas", "Puczyk");
        lekarz3.Dodajpacjenta(olivier);

        System.out.println(orzel);
        System.out.println(michu);
        System.out.println(olivier);
    }
}
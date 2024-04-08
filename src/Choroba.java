import java.util.Objects;

public class Choroba {
    private String nazwa_choroby;
    private int stopien_smiertelnosci;

    public Choroba(String nazwa_choroby) {
        this.nazwa_choroby = nazwa_choroby;
    }
    public Choroba(){

    }

    public String getNazwa_choroby() {
        return nazwa_choroby;
    }

    public int getStopien_smiertelnosci() {
        return stopien_smiertelnosci;
    }

    public void setNazwa_choroby(String nazwa_choroby) {
        this.nazwa_choroby = nazwa_choroby;
    }

    public void setStopien_smiertelnosci(int stopien_smiertelnosci) {
        this.stopien_smiertelnosci = stopien_smiertelnosci;
    }

    @Override
    public String toString() {
        return String.format("%s, %d", nazwa_choroby, stopien_smiertelnosci);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Choroba choroba = (Choroba) o;
        return stopien_smiertelnosci == choroba.stopien_smiertelnosci && Objects.equals(nazwa_choroby, choroba.nazwa_choroby);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nazwa_choroby, stopien_smiertelnosci);
    }
}

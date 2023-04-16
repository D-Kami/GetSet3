public class Uczelnia {

    private String id;
    private String nazwa;
    private String miejscowosc;
    private String opis;

    public Uczelnia() {}

    public Uczelnia(String id, String nazwa, String miejscowosc, String opis) {
        this.id = id;
        this.nazwa = nazwa;
        this.miejscowosc = miejscowosc;
        this.opis = opis;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getMiejscowosc() {
        return miejscowosc;
    }

    public void setMiejscowosc(String miejscowosc) {
        this.miejscowosc = miejscowosc;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }




    @Override
    public String toString() {
        return "Uczelnia{" +
                "id='" + id + '\'' +
                ", nazwa='" + nazwa + '\'' +
                ", miejscowosc='" + miejscowosc + '\'' +
                ", opis='" + opis + '\'' +
                '}';
    }
}

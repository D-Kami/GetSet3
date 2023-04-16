public class Oceny {

    private String id;
    private int ocena;
    private String komentarz;

    public Oceny() {}

    public Oceny(String id, int ocena, String komentarz) {
        this.id = id;
        this.ocena = ocena;
        this.komentarz = komentarz;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getOcena() {
        return ocena;
    }

    public void setOcena(int ocena) {
        this.ocena = ocena;
    }

    public String getKomentarz() {
        return komentarz;
    }

    public void setKomentarz(String komentarz) {
        this.komentarz = komentarz;
    }

    @Override
    public String toString() {
        return "Oceny{" +
                "id='" + id + '\'' +
                ", ocena=" + ocena +
                ", komentarz='" + komentarz + '\'' +
                '}';
    }
}

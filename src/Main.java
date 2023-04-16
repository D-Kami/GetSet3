import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {

        Nauczyciel nauczyciel = new Nauczyciel("Profesor", "Jan", "Kowalski", "Wroclaw", 123456789);
        out.println(nauczyciel.toString());
        Uczen uczen = new Uczen("Uczen", "Adam", "Mickiewicz", "Wroclaw", 5, 789456132);
        out.println(uczen.toString());
        Uczelnia uczelnia = new Uczelnia("Uczelnia", "Wyzsza szkola", "Wroclaw", "zaoczna");
        out.println(uczelnia.toString());
        Kierunek kierunek = new Kierunek("Kierunek", "Programowanie", "JAVA");
        out.println(kierunek.toString());
        Oceny oceny = new Oceny("Ocena", 5, "Bardzo dobry");
        out.println(oceny.toString());


    }
}
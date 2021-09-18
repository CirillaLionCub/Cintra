import java.util.Scanner;

public class Calculator {

    /*public static void main(String[] args) {

        Scanner cyfr = new Scanner(System.in);
        System.out.println("Proszę, podaj pierwszą liczbę");
        int Cyfra = cyfr.nextInt();
        System.out.println("Kwadrat tej liczby to: " + Cyfra*Cyfra);
        int result1 = Cyfra*Cyfra;
        System.out.println("Proszę, podaj drugą liczbę"); // w przykladzie pokazanym przez prowadzace.
        // Najpierw prosi uzytkownika o obie liczby a potem pisze operacje jakie ma dokonac program.
        // Byc moze ten sposob jest bardziej przejrzysty
        int liczba = cyfr.nextInt();
        System.out.println("Wynik mnożenia tych dwóch liczb to: " + Cyfra*liczba);
        System.out.println("A mnożenie kwadratu oraz drugiej liczby daje: " + result1*liczba);
        float result2 = Cyfra*liczba;
        System.out.println("Wynik dzielenia obu rezultatów daje: " + result1/result2);
    }*/

    public static void main(String[] args) {

        Scanner cyfr = new Scanner(System.in); // wszystko zalezy w ktorym momencie chcemy pozyskac dane od uzytkownika
        System.out.println("Proszę, podaj pierwszą liczbę"); // nazwy liczbom numerycznie jesli ejst ich wiecej
        int Cyfra = cyfr.nextInt();
        System.out.println("Proszę, podaj drugą liczbę");
        int liczba = cyfr.nextInt();
        int result1 = Cyfra*Cyfra;
        float result2 = Cyfra*liczba;
        System.out.println("Kwadrat pierwszej liczby to: " + Cyfra*Cyfra);
        System.out.println("Wynik mnożenia tych dwóch liczb to: " + Cyfra*liczba);
        System.out.println("A mnożenie kwadratu oraz drugiej liczby daje: " + result1*liczba);
        System.out.println("Wynik dzielenia obu rezultatów daje: " + result1/result2);

        int addition = Cyfra + liczba;
        int subtraction = Cyfra - liczba;
        int multiplication = Cyfra * liczba;
        float division = Cyfra / liczba;
        int mod = Cyfra%liczba;

        System.out.println ("Wynik dodawania obu liczb: " + addition);
        System.out.println ("Wynik odejmowania obu liczb: " + subtraction);
        System.out.println ("Wynik mnożenia obu liczb: " + multiplication);
        System.out.println ("Wynik dzielenia pierwszej liczby przez drugą: " + division);
        System.out.println ("Wynik modulo dla obu liczb: " + mod);
    }
}

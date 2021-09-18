import java.util.Scanner;

public class CustomScanner {

    /*public static void main(String[] args) {
        Scanner name = new Scanner(System.in); // tworzenie nowego obiektu klasy Scanner. Zmienna o nazwie name
        System.out.println("Proszę, podaj swoje imię i naciśnij enter");
        String Name = name.nextLine();
        System.out.println(" hejka " + Name + " !");
    }*/


    public static void main(String[] args) {
        Scanner cyfr = new Scanner(System.in);
        System.out.println("Proszę, podaj pierwszą liczbę");
        int Cyfra = cyfr.nextInt();
        System.out.println("Kwadrat tej liczby to: " + Cyfra*Cyfra);
    }
}
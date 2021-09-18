import java.util.Objects;
import java.util.Scanner;

public class CustomScanner {

    /*public static void main(String[] args) {
        Scanner name = new Scanner(System.in); // tworzenie nowego obiektu klasy Scanner. Zmienna o nazwie name
        System.out.println("Proszę, podaj swoje imię i naciśnij enter");
        String Name = name.nextLine();
        System.out.println(" hejka " + Name + " !");
    }*/


    public static void main(String[] args) {
        /*Scanner cyfr = new Scanner(System.in);
        System.out.println("Proszę, podaj pierwszą liczbę");
        int Cyfra = cyfr.nextInt();
        System.out.println("Kwadrat tej liczby to: " + Cyfra*Cyfra);*/

        Scanner nameYours = new Scanner(System.in);
        System.out.println("Is it true that the North is being harrassed by the Whitewalkers? Enter: yes, no or dunno");

        String dunno = nameYours.nextLine();
        String yes = nameYours.nextLine();
        String no = nameYours.nextLine();

        if (Objects.equals(dunno, "dunno")){
            System.out.println(" You know nothing, John Snow!");

        } else if (Objects.equals(yes, "yes")) {
            System.out.println(" You must be from the North yourself!");

        } else if (Objects.equals(no, "no")) {
            System.out.println(" Are you Cersai?");
        }
    }
}
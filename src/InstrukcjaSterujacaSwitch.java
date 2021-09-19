import java.util.Scanner;

public class InstrukcjaSterujacaSwitch {

    public static void main(String[] args) {

        String answer = "can";

        /*System.out.println("Is it true that the North is being harrassed by the Whitewalkers? Enter: yes, no or dunno");

        Scanner Answer = new Scanner(System.in);*/

        switch (answer) {
            case "dunno":
                System.out.println(" You know nothing, John Snow!");
                break;

            case "yes":
                System.out.println(" You must be from the North yourself!");
                break;

            case "no":
                System.out.println(" Are you Cersai?");
                break;

            default:
                System.out.println(" All I gotta say is: Winter is coming, mate!");

        }

        /*Scanner nameYours = new Scanner(System.in);
        System.out.println("Is it true that the North is being harrassed by the Whitewalkers? Enter: yes, no or dunno");

        String dunno = nameYours.nextLine();
        String yes = nameYours.nextLine();
        String no = nameYours.nextLine();

        if dunno {
            System.out.println(" You know nothing, John Snow!");

        }
        swicth yes {
            System.out.println(" You must be from the North yourself!");

        }
        switch no {
            System.out.println(" Are you Cersai?");
        }*/




    }
}
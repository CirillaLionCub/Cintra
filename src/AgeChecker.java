import java.util.Scanner;

public class AgeChecker {

    public static void main(String[] args) {

        Scanner number = new Scanner(System.in);
        System.out.println("How old are you?"); //ta kolejnosc jest istotna, inaczej nie pojawi sie pytanie!
        int age = number.nextInt();

        if(age < 18 && age >= 0) {
            System.out.println("We are sorry, you are not allowed to buy any alcohol"); //tutaj trzeba poszerzyc
            // warunek dla zera jako rowna sie, zeby ten wiek tez wykluczyc

        } else if (age < 0){
            System.out.println("This is incorrect. Please insert your age again");

        } else {
            System.out.println("Glad you came, thank you for your visit!"); //tak jak to widze to alternatywnie
            // mozna by zrobic dla >18 oraz <=0 i else dla pozostalych
        }

    }
}

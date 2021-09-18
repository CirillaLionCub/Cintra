import java.util.Scanner;

public class OperatoryPorownania {

    /*public static void main(String[] args) {

        int firstNumber = 4;
        int secondNumber = 6;

        /*boolean result = secondNumber > firstNumber;
        System.out.println(result);*/

        /*System.out.println (firstNumber > secondNumber); //false
        System.out.println (firstNumber < secondNumber); //true
        System.out.println (firstNumber >= secondNumber); //false
        System.out.println (firstNumber <= secondNumber); //true
        System.out.println (firstNumber == secondNumber); //false
        System.out.println (firstNumber != secondNumber); //true } */

    public static void main(String[] args) {

        Scanner cyfr = new Scanner(System.in);
        System.out.println("Please, provide the first number");
        int firstNumber = cyfr.nextInt();
        System.out.println("Please provide the second number");
        int secondNumber = cyfr.nextInt();

        System.out.println ("Is the first number bigger than the second number : " + (firstNumber > secondNumber));
        System.out.println ("Is the first number smaller than the second number : " + (firstNumber < secondNumber));
        System.out.println ("Is the first number bigger than or equal to the second number : " + (firstNumber >= secondNumber));
        System.out.println ("Is the first number smaller than or equal to the second number : " + (firstNumber <= secondNumber));
        System.out.println ("Is the first number equal to the second number : " + (firstNumber == secondNumber));
        System.out.println ("Does the first number differ from the second number : " + (firstNumber != secondNumber));
    }
}

public class OperatoryMatematyczne {

    public static void main(String[] args) {
        int firstNumber = 4;
        int secondNumber = 6;
        float thirdNumber = 4.0F;

        int addition = firstNumber + secondNumber;
        int subtraction = firstNumber - secondNumber;
        int multiplication = firstNumber * secondNumber;
        float division = thirdNumber / secondNumber;
        int mod = secondNumber%firstNumber;

        System.out.println ("Wynik dodawania: " + addition);
        System.out.println ("Wynik odejmowania: " + subtraction);
        System.out.println ("Wynik mnożenia: " + multiplication);
        System.out.println ("Wynik dzielenia: " + division);
        System.out.println ("Wynik modulo: " + mod);

        firstNumber+=secondNumber; // co znaczy ze firstNumber= first Number+ secondNumber
        // i ze wartosc first Number zostala zmieniona dla kolejnej operacji, ktora nastepuje po niej
        System.out.println ("Po dodaniu: " + firstNumber); //10
        firstNumber-=secondNumber;
        System.out.println ("Po odjęciu: " + firstNumber); //4
        firstNumber*=secondNumber;
        System.out.println ("Po mnożeniu: " + firstNumber); //24
        firstNumber/=secondNumber;
        System.out.println ("Po podzielniu: " + firstNumber); //4
        firstNumber%=secondNumber;
        System.out.println ("Po modulo: " + firstNumber); //4






    }
}

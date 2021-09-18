public class InstrukcjaWarunkowaIf {

    public static void main(String[] args) {

        float dzielna = 4.0F;
        float dzielnik = 0;

        if(dzielnik != 0) {
            System.out.println("The outcome of division is : " + dzielna / dzielnik);

        }else {
            System.out.println("Please provide any number other than zero"); // dla wszystkich innych wynikow niz przewidziane w warunku
        }


    }
}

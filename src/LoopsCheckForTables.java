public class LoopsCheckForTables {

    //1-100 podzielne przez 3 oraz odwroc elementy tablicy

    public static void main(String[] args) {

        /*int [] numbers = new int[]{1-100}; // mozna tez wpisywac aliczy ale zakres zdaje sie dzialac - do weryfikacji */

        for (int i = 1; i < 101 && i > 0; i++) { //zaczynamy od 1 bo podany zakres tablicy jest od 1 do 100
            if (i % 3 == 0) {
                System.out.println("Number that can be divided by 3 : " + i);
            }

            int[] numbers = new int[]{4, 8, 7};
            int lastIndex = numbers.length - 1;

            int first = numbers[0];
            int last = numbers[lastIndex];

            numbers[0] = last;
            numbers[lastIndex] = first;

            for (int number : numbers) {
                System.out.println(number + " ");
            }
        }
    }
}

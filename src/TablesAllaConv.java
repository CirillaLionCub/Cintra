public class TablesAllaConv {

    public static void main(String[] args) {

        int[] numbers = new int[]{1, 3, 5, 7, 0};

        for (int i = 0; i < (numbers.length / 2); i++) {
            int temp = numbers[i];
            numbers[i] = numbers[numbers.length - 1 - i]; // czyli numers length to 6 wartosci w zbiorze, indexu jest zawsze o 1 mniej
            //czyli 6-1=5 miejsc w indexie. number i to ejst miejsce w indexie. Czyli 5 - nr indeksu 0 =5 - zajmie ta pozycja 5 nr w indeksie
            // 5- nr indeksu 3 = 2 miejsce w indexie
            numbers[numbers.length - 1 - i] = temp;

        }
        for (int number : numbers) {
            System.out.println(number + " ");
        }
    }
}

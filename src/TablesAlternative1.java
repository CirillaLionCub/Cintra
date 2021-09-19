public class TablesAlternative1 {

    public static void main(String[] args) {

        int[] numbers = new int[]{4, 8, 7};
        int lastIndex = numbers.length - 1;
        int temp = numbers[0];

        numbers[0] = numbers [lastIndex];
        numbers [lastIndex] = temp;

        for (int number : numbers) {
            System.out.println(number + " ");
        }
    }
}

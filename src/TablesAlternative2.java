public class TablesAlternative2 {

    public static void main(String[] args) {

        int[] numbers = new int[]{4, 8, 7};

        numbers[0] = numbers[0] +numbers [numbers.length-1];
        numbers [numbers.length-1] = numbers[0] - numbers [numbers.length-1];
        numbers[0] = numbers[0] - numbers [numbers.length-1];


        for (int number : numbers) {
            System.out.println(number + " ");
        }
    }
}

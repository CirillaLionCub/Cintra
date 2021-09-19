public class DoWhileLoop {

    public static void main(String[] args) {

        int number = 23;
        do {
            System.out.println("I am your lucky " + number + "and I am above 20");
            number--;
        }
        while (number > 20);

        int num = 7;
        do {
            System.out.println("I am your lucky " + num + "and I am still less than 20");
            num++;
        }
        while (num < 20);
    }

}

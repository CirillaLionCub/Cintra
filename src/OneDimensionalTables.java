public class OneDimensionalTables {

    public static void main(String[] args) {

        String [] winterMonths = new String[3];
        winterMonths [0] = "December";
        winterMonths [1] = "January";
        winterMonths [2] = "February";

        int[] lottoNumbers = new int[] {1,4,6,47,8,34};

        /*System.out.println(winterMonths [0]); //December
        System.out.println(lottoNumbers [3]); //47  a potem ciag numerow wygrywajacych w lotto
        System.out.println(lottoNumbers [0]);
        System.out.println(lottoNumbers [1]);
        System.out.println(lottoNumbers [2]);
        System.out.println(lottoNumbers [4]);
        System.out.println(lottoNumbers [5]);

        System.out.println(lottoNumbers.length);
        System.out.println(winterMonths.length);*/

        for (int i = 0; i < lottoNumbers.length; i++) {
            System.out.println(lottoNumbers [i]);
        }
    }
}

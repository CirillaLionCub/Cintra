public class ForLoop {

    public static void main(String[] args) {

        int number = 666; //nie trzeba tutaj deklarowac tej zmiennej liczbowej,
        // ale znacznie latwiej bedzie ja ewentualnie podmienic w przypadku koniecznosci/zmian,
        // niz gdy bedzie ona wpisywana recznie w ramach kodu

        /*for (int i = 0; i< number;i = i + 2) {
            System.out.println(i);
        }*/
        for (int i = 0; i<600; i++){
            if (i % 5 == 0){
                System.out.println(i);
            }
        }
    }


}

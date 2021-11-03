import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* Tablice - cw_6 */

        /* zad1. stworzyć tablicę typu double 5-cio elementową,
        przypisać do niej wartości i wyświetlić */

        double[] tab_1 = new double[5];
        for (int i = 0; i < tab_1.length; i++) {
            tab_1[i] = i + 0.1;
        }

        for (int i = 0; i < tab_1.length; i++) {
            System.out.print(tab_1[i] + " ");

        }
    }
}

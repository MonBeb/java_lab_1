import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw.5 */

        /* zad.1 podziel swój wiek przez modulo 3 i jeśli twój wiek zwraca 0 wyświetl napis "Podzielny przez 3",
         * w innym wypadku "Niepodzielny przez 3" użyj kontrukcji if else
         * */
        int zmiennaWiek = 27;
        int zmiennaWynik = (zmiennaWiek % 3 == 0) ? 0 : 1;

        if (zmiennaWynik == 0) {
            System.out.println("Podzielny przez 3");
        } else {
            System.out.println("Niepodzielny przez 3");
        }
        /* zad.2 użyj parametru trójargumentowego aby sprawdzić parzystośc nr. indeksu */

        int zmiennaIndeks = 121212;
        int zmiennaParzysta = (zmiennaIndeks % 2 == 0) ? 0 : 1;
        if (zmiennaParzysta == 0) {
            System.out.println("Numer indeksu jest parzysty " + zmiennaParzysta + ".");
        } else {
            System.out.println("Numer indeksu jest nieparzysty " + zmiennaParzysta + ".");
        }

        /* zad.3 wpisz z klawiatury liczbę zmiennoprzecinkową (użyj klasy Scanner z poprzednich ćwiczeń)
         * i stwórz konstrukcję else if z dowolnymi komunikatami */
        Scanner scan = new Scanner(System.in);

        System.out.print("Napisz liczbę, o której myślę (max. 5 cyfr): ");
        float liczba = scan.nextFloat();

        if (liczba == 55555) {
            System.out.println("Doskonale!!! Właśnie o tej liczbie myślałam!!!");

        } else if (liczba < 55555) {
        System.out.println("Niestety... Liczba, o której myślałam jest większa.");
        } else if (liczba > 55555) {
        System.out.println("Niestety... Liczba, o której myślałam jest mniejsza.");
        }
    }
}
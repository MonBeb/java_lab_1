import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw.2 */

        /*   zad.1 zadeklaruj i zainicjalizuj zmienne różnych typów i wyświetl w konsoli (im więcej tym lepiej ;) ) */

        /*
         *    zad.2 Napisz kod który będzie wykonywał operacje: dodawania, odejmowania,
         *    mnożenia, dziealenia i modulo na zmiennych:
         *    a) liczbaA i liczbaB, dowolne liczby calkowite (int),
         *    b) liczbaX i liczbaY, dowolne liczby zmiennoprzecinkowe (double)
         *  */
        /* Zadanie 1 */

        byte zmiennaA = 12;
        System.out.println("Oto zmienna byte = " + zmiennaA);

        short zmiennaB = 1234;
        System.out.println("Oto zmienna short = " + zmiennaB);

        int zmiennaC = 12345;
        System.out.println("Oto zmienna int = " + zmiennaC);

        long zmiennaD = 1000000000000L;
        System.out.println("Oto zmienna long = " + zmiennaD);

        float zmiennaE = 12.34f;
        System.out.println("Oto zmienna float = " + zmiennaE);

        double zmiennaF = 123456.1234;
        System.out.println("Oto zmienna double = " + zmiennaF);

        boolean zmiennaG = false;
        System.out.println("Oto zmienna boolean czyli " + zmiennaG);

        char zmiennaH = 'f';
        System.out.println("Oto zmienna char czyli " + zmiennaH);

        String zmiennaI = "Zadanie 2";
        System.out.println("Oto zmienna String czyli " + zmiennaI);

        /* Zadanie 2a */

        int a = 100;
        int b = 55;

        int wynikDodawanie = a + b;
        System.out.println(wynikDodawanie);

        int wynikOdejmowanie = a - b;
        System.out.println(wynikOdejmowanie);

        int wynikIloczyn;
        wynikIloczyn = a * b;
        System.out.println(wynikIloczyn);

        int wynikDzielenie = a/b;
        System.out.println(wynikDzielenie);

        int wynikModulo = a % b;
        System.out.println(wynikModulo);

        /* Zadanie 2b */

        double c = 220022.1234;
        double d = 110011.4321;

        double dodawanie = c + d;
        System.out.println(dodawanie);

        double odejmowanie = c - d;
        System.out.println(odejmowanie);

        double iloczyn = c * d;
        System.out.println(iloczyn);

        double dzielenie = c/d;
        System.out.println(dzielenie);

        double modulo = c%d;
        System.out.println(modulo);

    }
}



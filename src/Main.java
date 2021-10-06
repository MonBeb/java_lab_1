import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw.3 */

        /*  zad.1 napisać interfejs który bedzie słuzył do wpisania danych osobowych:
         *   a) Imię, nazwisko, wiek, nr indeksu,
         *   dane mają być wprowadzane z klawiatury w konsoli
         *   b) wyświetlić dane za pomocą println i printf
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Podaj imię:");
        String imię = scan.next();

        System.out.println("Podaj nazwisko: ");
        String nazwisko = scan.next();

        System.out.println("Podaj wiek: ");
        int wiek = scan.nextInt();

        System.out.println("Podaj numer indeksu: ");
        int indeksu = scan.nextInt();

        System.out.printf("Twoje imię to %s, nazwisko to %s a wiek to %d   \n", imię, nazwisko, wiek);

        System.out.println("Kłamiesz!! Twój wiek to nie " + wiek + " a dokładnie " + (wiek + 10));


        /*  zad.2 zadeklarować 2 zmienne typu int i wykonać na nich obliczenia arytmetyczn (+, -, *, /, %)
         *   wynik wyświetlić w konsoli programu
         */

        int a = 111;
        int b = 222;

        int wynikDodawanie = a + b;
        int wynikOdejmowanie = b - a;
        int wynikMnożenie = a * b;
        int wynikDzielenie = b/a;
        int wynikModulo = a % b;

        System.out.println("Podaj wynik dodawania: 111 + 222 = ");
        int suma = scan.nextInt();
        System.out.println("Wynik to " + wynikDodawanie);

        System.out.println("Podaj wynik odejmowania: 111 - 222 = ");
        int różnica = scan.nextInt();
        System.out.println("Wynik to " + wynikOdejmowanie);

        System.out.println("Podaj wynik mnożenia: 111 * 222 = ");
        int iloczyn = scan.nextInt();
        System.out.println("Wynik to " + wynikMnożenie);

        System.out.println("Podaj wynik dzielenia: 111/222 = ");
        int iloraz = scan.nextInt();
        System.out.println("Wynik to " + wynikDzielenie);

        System.out.println("Podaj wynik modulo: 111 % 222 = ");
        int modulo2 = scan.nextInt();
        System.out.println("Wynik to " + wynikModulo);

    }
}
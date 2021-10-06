import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw.3 */

        /*  zad.1 napisać interfejs który bedzie słuzył do wpisania danych osobowych:
         *   a) Imię, nazwisko, wiek, nr indeksu,
         *   dane mają być wprowadzane z klawiatury w konsoli*/
        /*   b) wyświetlić dane za pomocą println i printf
         */

        Scanner scan = new Scanner(System.in);

        System.out.print("Podaj imię: ");
        String imię = scan.next();

        System.out.print("Podaj nazwisko: ");
        String nazwisko = scan.next();

        System.out.print("Podaj wiek: ");
        int wiek = scan.nextInt();

        System.out.print("Podaj numer indeksu: ");
        int indeks = scan.nextInt();

        System.out.printf("Twóje imię to: %s, a wiek to: %d \n", imię, wiek);
        System.out.println("Błędny numer indeksu. Twój numer indeksu to numer który podałeś: " + indeks + " plus: 33, czyli: " + (indeks + 33));

        /*  zad.2 zadeklarować 2 zmienne typu int i wykonać na nich obliczenia arytmetyczn (+, -, *, /, %)
         *   wynik wyświetlić w konsoli programu
         */

       int A = 100;
       int B = 155;

       int suma = A + B;
       int różnica = A - B;
       int iloczyn = A * B;
       int iloraz = B/A;
       int modulo = A % B;


       System.out.print("Podaj wynik dla sumy: 100 + 155 = ");
       int dodawanie = scan.nextInt();
       System.out.println("Poprawny wynik to: " + suma);

       System.out.print("Podaj wynik dla różnicy: 100 - 155 = ");
       int odejmowanie = scan.nextInt();
       System.out.println("Poprawny wynik to: " + różnica);

       System.out.print("Podaj wynik dla iloczynu: 100 * 155 = ");
       int mnożenie = scan.nextInt();
       System.out.println("Poprawny wynik to: " + iloczyn);

       System.out.print("Podaj wynik dla ilorazu: 100/155 = ");
       int dzielenie = scan.nextInt();
       System.out.println("Poprawny wynik to: " + iloraz);

       System.out.print("Podaj wynik dla sumy: 100 % 155 = ");
       int modulo1 = scan.nextInt();
       System.out.println("Poprawny wynik to: " + modulo);
    }
}
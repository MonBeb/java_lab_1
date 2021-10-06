import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw.4 */

        /* zad.1 proszę dodać kilka złożonych operacji uzywając kilku operatorów arytmetycznych i logicznych */

        boolean a = true;
        boolean b = false;
        boolean c = false;

        int x = 10;
        int y = 20;
        int z = 30;

        System.out.println("(b == a) || (x == z): " + ((b == a) || (x == z)));
        System.out.println("(z > y) || (y > x): " + ((z > y) || (y > x)));
        System.out.println("(z >= x) || (b != c): " + ((z >= x) || (b != c)));
        System.out.println("(b || c) && (x < y): " + ((b || c) && (x < y)));
        System.out.println("(y > x) || (a && b): " + ((y > x) || (a && b)));







    }
}
import java.util.ArrayList;
import java.util.Scanner;

public class Minimum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Anzahl der Elemente: ");
        int anzahl = sc.nextInt();
        int small = Integer.MAX_VALUE;
        ArrayList<Integer> zahlen = new ArrayList<>(anzahl);

        for (int i = 1; i <= anzahl; i++) {
            System.out.println("Element " + i + " eingeben: ");
            int zahl = sc.nextInt();
            zahlen.add(zahl);

        }
        for (int j : zahlen) {
            if (j < small) {
                small = j;
            }
        }
        System.out.println(small);
        sc.close();
    }
}


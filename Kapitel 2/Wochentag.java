import java.util.Scanner;

public class Wochentag {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d, m, year, y, c;

        System.out.println("Tag:");
        d = sc.nextInt();
        System.out.println("Monat:");
        System.out.println("Bei Januar oder Februar vorheriges Jahr angeben");
        m = sc.nextInt();
        System.out.println("Jahr:");
        year = sc.nextInt();

        if (m == 1) {
            m = 13;
            --year;
        }
        else if (m == 2){
            m = 14;
            --year;
        }

        y = year % 100;
        c = (year / 100);

        int w = (d + ((26 * (m + 1)) / 10) + (5 * y) / 4 + c / 4 + 5 * c - 1) % 7;

        System.out.println(w);
        if (w == 0)
            System.out.print("Sonntag");
        else if (w == 1)
            System.out.print("Montag");
        else if (w == 2)
            System.out.print("Dienstag");
        else if (w == 3)
            System.out.print("Mittwoch");
        else if (w == 4)
            System.out.print("Donnerstag");
        else if (w == 5)
            System.out.print("Freitag");
        else
            System.out.print("Samstag");

        sc.close();
    }

}


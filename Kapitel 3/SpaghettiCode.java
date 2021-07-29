import java.util.Scanner;

public class SpaghettiCode {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;

        x = sc.nextInt();

        if (x == 0) {
            System.out.println(x);
        }
        else if (x > 2005) {
            System.out.println((int) Math.sqrt(x));
        }
        else {
            x = x * (x + x);
            x *= x;
            System.out.println(x);
        }
        sc.close();
    }
}

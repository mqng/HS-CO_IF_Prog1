import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long f0 = 0, f1 = 1;
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print(f0 + " "); //Wenn einzelne Schritte erwünscht sind

            long sum = f0 + f1;
            f0 = f1;
            f1 = sum;

        }
        System.out.println(f0);
        sc.close();
    }
}

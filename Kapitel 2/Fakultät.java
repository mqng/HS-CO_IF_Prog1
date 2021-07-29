import java.util.Scanner;

public class Fakultät {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        long j = n;
        long fak = 1;
        long count = 1;

        while (count < j) {
            fak = fak * n;
            n = n - 1;
            count++;
        }

        System.out.println(fak);
        
        sc.close();
    }
}

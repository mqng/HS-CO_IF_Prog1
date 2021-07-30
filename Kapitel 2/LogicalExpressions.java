import java.util.Scanner;

public class LogicalExpressions {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a, b, c, d;
        boolean result1 = false, result2 = false, result3 = false, result4 = false;

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();

        if (a > 1 || b > 1 || c > 1 || d > 1)
            result1 = true;

        if ((a > 1 & b > 1 & c > 1 & d <= 1) || (a > 1 & b > 1 & c <= 1 & d > 1) || (a > 1 & b <= 1 & c > 1 & d > 1) || (a <= 1 & b > 1 & c > 1 & d > 1) || (a <= 1 & b > 1 & c <= 1 & d > 1) || (a > 1 & b <= 1 & c <= 1 & d > 1) ||
                (a <= 1 & b <= 1 & c > 1 & d > 1) || (a > 1 & b <= 1 & c > 1 & d <= 1) || (a <= 1 & c > 1 & b > 1 & d <= 1) || (a > 1 & b <= 1 & c <= 1 & d <= 1) || (a <= 1 & b > 1 & c <= 1 & d <= 1) ||(a <= 1 & b <= 1 & c > 1 & d <= 1) ||
                    (a <= 1 & b <= 1 & c <= 1 & d > 1))
            result2 = true;

        if (a < 0 & b >= 0 & c >= 0 & d >= 0 || b < 0 & a >= 0 & c >= 0 & d >= 0 || c < 0 & a >= 0 & b >= 0 & d >= 0 | d < 0 & a >= 0 & b >= 0 & c >= 0)
            result3 = true;

        if (a > 0 & a > 10 || b > 0 & b > 10 || c > 0 & c > 10 || d > 0 & d > 10)
            result4 = true;

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);

        sc.close();
    }
}

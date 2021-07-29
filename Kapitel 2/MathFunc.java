import java.util.Scanner;

public class MathFunc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, m;
        double x, y;
        double a0 = 1.0, a1 = 2.5, a2 = 0.1, a3 = 0.0, a4 = 0.8, a5 = 0.0, a6 = 1.5;
        
        System.out.print("Bitte n eingeben: ");
        n = sc.nextInt();
        
        System.out.print("Bitte m eingeben: ");
        m = sc.nextInt();

        System.out.print("Bitte x eingeben: ");
        x = sc.nextDouble();

        double nx = n;
        double mx = m;
        double e = Math.E;

        double y1 = Math.log(Math.abs(n - m) * x);
        double y2 = Math.sin(((nx + mx) / 2) * x) - Math.cos(((nx - mx) / 2) * x);
        double y3 = 0.5 * (((nx - mx) / (nx + mx)) * x * Math.pow(e, -(nx + mx) * Math.pow(x, 2)));
        double y4 = a0 - a1 * x + a2 * Math.pow(x, 2) - a3 * Math.pow(x, 3) + a4 * Math.pow(x, 4) - a5 * Math.pow(x, 5) + a6 * Math.pow(x, 6);
        double y5a = Math.pow(Math.pow(e,x) + x,2);
        double y5b = 0.5 * x + Math.pow(e,x);

        double y5 = (y5a / y5b) - Math.pow(e,x);


        System.out.println(y1);
        System.out.println(y2);
        System.out.println(y3);
        System.out.println(y4);
        System.out.println(y5);

        sc.close();
    }
}

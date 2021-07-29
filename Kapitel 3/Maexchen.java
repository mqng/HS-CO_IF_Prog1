import java.util.Scanner;

public class Maexchen {

    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);

        int w1 = sc.nextInt();
        int w2 = sc.nextInt();
        
        if (w1 + w2 == 3) {
            System.out.println("1000 Punkte");
        } else if (w1 == w2) {
            System.out.println("Pasch");
            int pasch = (w1 + w2) * 100;
            System.out.println(pasch + " Punkte");
        } else if (w1 < w2) {
            int a = (w2 * 10) + w1;
            System.out.println(a);
        } else {
            int b = (w1 * 10) + w2;
            System.out.println(b);
        }

        sc.close();
    }

}

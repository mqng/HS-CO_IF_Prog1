import java.util.Scanner;

public class Rechentest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {

            int x = (int) (Math.random() * 32) + 1;
            int y = (int) (Math.random() * 32) + 1;

            int op = (int) (Math.random() * 3) + 1;

            switch (op) {
                case 1:
                    System.out.println(x + " - " + y);
                    int m = sc.nextInt();
                    if (m == x - y) {
                        System.out.println("Joa... weiter!\n");
                    } else {
                        System.out.println("Falsch, Idiot!\n");
                    }
                    break;

                case 2:
                    System.out.println(x + " + " + y);
                    int p = sc.nextInt();
                    if (p == x + y) {
                        System.out.println("Richtig\n");
                    } else {
                        System.out.println("Falsch\n");
                    }
                    break;

                case 3:
                    System.out.println(x + " : " + y);
                    int d = sc.nextInt();
                    if (d == x / y){
                        System.out.println("Richtig\n");
                    } else {
                        System.out.println("Falsch\n");
                    }
                    break;

                case 4:
                    System.out.println(x + " x " + y);
                    int t = sc.nextInt();
                    if (t == x * y) {
                        System.out.println("Richtig\n");
                    } else {
                        System.out.println("Falsch\n");
                    }
                    break;
			}
			sc.close();
        }
        	
    }
}


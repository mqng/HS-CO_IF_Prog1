public class Mult {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int fakultaet = 1;
        if (n >= 3) {
            while (n >= 3) {
                fakultaet *= n;
                n -= 1;
            }
            System.out.println(fakultaet);
        } else {
            System.out.println(1);
        }
    }
}

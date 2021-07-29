public class Infinity {
    public static void main(String[] args){
        float zaehler = 2.5e27f, nenner = 3.4e-12f;
        float x = zaehler / nenner;

        System.out.println(zaehler);
        System.out.println(nenner);
        System.out.println(x);

        System.out.println("\n" + Math.sqrt(-4));
        System.out.println(0.0/0.0);
        System.out.println(1E300 * 1E20);
        System.out.println(-1E300 * 1E20);
    }
}


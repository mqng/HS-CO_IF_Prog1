public class Inkrements {
    public static void main(String[] args) {
        int q = 5, x = 5, y = 5, z = 5;
        int count = 5, total = 5, divisor = 5;

        x++;
        ++x;
        x += 1;
        x = x + 1;

        z = x++ + y; 

        if (count > 10) {
            System.out.println("Count is greater than 10");
        }
        
        total -= --x;

        q = q % divisor;
        q %= divisor;
    }
}

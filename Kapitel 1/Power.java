public class Power {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int quadrat = 1, potenz = 1, counter = 1;
        
        System.out.println("Zahl\tQuadrat\tKubisch");
        System.out.println("==========================");
        
        while (counter <= n) {
            quadrat = counter * counter;
            potenz = counter * counter * counter;
            counter += 1;
            
            System.out.print(counter -1 + "\t");
            System.out.print(quadrat + "\t");
            System.out.print(potenz + "\n");
        }
    }
}

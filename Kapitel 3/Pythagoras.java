public class Pythagoras {

    public static void main(String[] args) {

        for (int a = 1; a <= 500; a++) {
            for (int b = 1; b <= 500; b++) {
                for (int c = 1; c <= 500; c++) {
                    if ((a * a) + (b * b) == (c * c)) {
                        System.out.println("Ankathete: " + a);
                        System.out.println("Gegenkathete: " + b);
                        System.out.println("Hypotenuse: " + c + "\n");
                    }
                }
            }
        }
    }
}


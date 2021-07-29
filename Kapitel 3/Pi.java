public class Pi {

    public static void main(String[] args){

        float a = (4-(4.0f/3.0f));

        for (float i = 3; i > 1;){

            System.out.println(a);

            i++;
            i++;
            a += 4/i;
            System.out.println(a);

            i++;
            i++;
            a = (a - 4/i);

        }
    }
}


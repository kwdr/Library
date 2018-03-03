package czwarteZadanie;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random rand =  new Random();
        int x = rand.nextInt(15);
        int y = rand.nextInt(10);

        System.out.println("x=" + x + " " + "y=" + y);

        boolean result = x > y;
        System.out.println("x > y = " + result);

        result = x*2 > y;
        System.out.println("x*2 > y =" + result);

        result = (x+3 > y) && (x-2 < y);
        System.out.println("x+3 > y && x-2 < y = " + result);

        result = ((x * y) % 2 == 0);
        System.out.println("((x * y) % 2 == 0) = " + result);


    }
}

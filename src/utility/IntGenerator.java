package utility;

import java.util.Random;

public class IntGenerator {
    public static int generateInteger() {
        Random r = new Random();
        int low = 150;
        int high = 500;
        return r.nextInt(high - low) + low;
    }
}

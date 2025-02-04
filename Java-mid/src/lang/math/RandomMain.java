package lang.math;

import java.util.Random;

public class RandomMain {
    public static void main(String[] args) {

        Random random = new Random(1);

        int randomInt = random.nextInt();
        System.out.println("randomInt = " + randomInt);

        double randomDouble = random.nextDouble();
        System.out.println("randomDouble = " + randomDouble);

        boolean randomBoolean = random.nextBoolean();
        System.out.println("randomBoolean = " + randomBoolean);

        int randomRange1 = random.nextInt(10);
        System.out.println("randomRange1 = " + randomRange1);

        int radomRange2 = random.nextInt(10) + 1;
        System.out.println("radomRange2 = " + radomRange2);

    }
}

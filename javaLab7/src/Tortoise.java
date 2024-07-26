import java.util.Random;

public class Tortoise extends Game{

    public static void tortoiseMove(int random, int position) {
        Random rand = new Random();
        System.out.println("--------------- Tortoise --------------");
        random = rand.nextInt(10);
        if (random <= 4) {
            tortoisePosition += 3;
            System.out.println("Fast Plod Move !! 3 block forward ");
        } else if (random >= 5 && random <= 6) {
            tortoisePosition -= 6;
            System.out.println("Slip Move !! 6 block backward");
        } else if (random >= 7 && random <= 9) {
            tortoisePosition += 1;
            System.out.println("Slow Plod Move !! 1 block forward");
        }
        if (tortoisePosition < 0) {
            tortoisePosition = 0;
        }
        if (tortoisePosition >= tortoiseRoad.length) {
            tortoisePosition = tortoiseRoad.length - 1;
        }
    }
}

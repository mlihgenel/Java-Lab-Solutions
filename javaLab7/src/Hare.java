import java.util.Random;

public class Hare extends Game{

    public static void hareMove(int random, int position) {
        Random rand = new Random();
        System.out.println("--------------- Hare --------------");
        random = rand.nextInt(10);
        if (random <= 1) {
            System.out.println("Sleep Move !! No position changed");
        } else if (random >= 2 && random <= 3) {
            harePosition += 9;
            System.out.println("Big Hop Move !! 9 block forward");
        } else if (random == 4) {
            harePosition -= 12;
            System.out.println("Big Slip Move !! 12 block backward");
        } else if (random >= 5 && random <= 7) {
            harePosition += 1;
            System.out.println("Small Hop Move !! 1 block forward");
        } else if (random >= 8 && random <= 9) {
            harePosition -= 2;
            System.out.println("Small Slip Move !! 2 block backward");
        }
        if (harePosition < 0) {
            harePosition = 0;
        }
        if (harePosition >= hareRoad.length) {
            harePosition = hareRoad.length - 1;
        }
    }
}

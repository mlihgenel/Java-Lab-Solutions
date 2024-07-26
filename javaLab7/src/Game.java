import java.util.Scanner;
public class Game {
    public static int tortoisePosition = 0;
    public static int harePosition = 0;
    public static int[] tortoiseRoad = new int[20];
    public static int[] hareRoad = new int[20];
    static int move;
    static String choice;
    static Scanner scanner = new Scanner(System.in);

    public static void playGame() {
        System.out.println("Press any key to start the game");
        choice = scanner.nextLine();

        while (!choice.equals("stop")) {
            Tortoise.tortoiseMove(move, tortoisePosition);
            printRoadTortoise();

            Hare.hareMove(move, harePosition);
            printRoadHare();

            if (tortoisePosition >= tortoiseRoad.length - 1 || harePosition >= hareRoad.length - 1) {
                if (tortoisePosition >= tortoiseRoad.length - 1) {
                    System.out.println("\nTortoise Won !! ");
                }
            else if(harePosition >= hareRoad.length - 1 || harePosition >=hareRoad.length - 1){
                if(harePosition >= hareRoad.length - 1) {
                    System.out.println("Hare Won !!");
                }
            }else{
                    System.out.println("It's a tie between Tortoise and Hare");
                }
            break;
            }

            System.out.println("Press 'y' to make a move or 'stop' to end the game");
            choice = scanner.nextLine();
        }
    }
    public static void printRoadTortoise() {
        for (int i = 0; i < tortoiseRoad.length; i++) {
            tortoiseRoad[i] = 0; // Reset array
        }
        tortoiseRoad[tortoisePosition] = 1; // Point the character's position
        for (int i = 0; i < tortoiseRoad.length; i++) {
            System.out.print("|" + tortoiseRoad[i] + "| ");
        }
        System.out.println();
    }

    public static void printRoadHare() {
        for (int i = 0; i < hareRoad.length; i++) {
            hareRoad[i] = 0; // Reset array
        }
        hareRoad[harePosition] = 1; // Point the character's position
        for (int i = 0; i < hareRoad.length; i++) {
            System.out.print("|" + hareRoad[i] + "| ");
        }
        System.out.println();
    }


}

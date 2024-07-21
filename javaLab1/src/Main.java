import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number;
        int expNumber;
        System.out.println("Enter the number : ");
        number = input.nextInt();
        System.out.println("Enter the exponent number : ");
        expNumber = input.nextInt();

        System.out.println(calculateIntegralValue(number,expNumber));
    }

    // -- 1. Question --
    // Calculate integral of the x^y
    // example : integral of ∫ 2^3 --->>  (2^4) / 4

    public static int calculateIntegralValue(int x,int y){
        int powerResult = 1;

        for (int i = 0; i <= y; i++) {
            powerResult = powerResult * x;
        }
        powerResult = powerResult / (y+1);

        return powerResult;
    }

}

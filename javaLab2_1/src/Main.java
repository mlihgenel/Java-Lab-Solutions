import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

    int[] array = {1,2,4,6,8,12,56,34,15};
    Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number to find in array : ");
        int number = input.nextInt();

    Boolean var = findInArray(array,number);
    System.out.println(var);
    }


    public static Boolean findInArray(int[] array,int number){
        Boolean var = null;
        for (int i = 0; i < array.length; i++) {
            if(array[i] == number){
                var = true;
                break;
            }
            else
                var = false;
        }

        return var;
    }
}

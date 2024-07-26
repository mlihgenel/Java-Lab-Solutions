import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // *** Creating a random integer array ***
        // Then call a selectionSort method to sorting

        int n;
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Length of the array : ");
        n = input.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(selectionSort(array)));
    }

    // *** Selection Sort Algorithm ***

    public static int[] selectionSort(int[] array){
        int min;

        for (int i = 0; i < array.length - 1; i++) {
            min = array[i];
            int minIndex = i;
            for (int j = i+1; j < array.length; j++) {
                if(array[j] < min) {
                    min = array[j];
                    minIndex = j;
                }
            }
            swap(array,i,minIndex);
        }

        return array;
    }

    // This method for swapping items

    public static void swap(int[] array, int a,int b){
        int temp;
        temp = array[a];
        array[a] = array[b];
        array[b] = temp;

    }
}
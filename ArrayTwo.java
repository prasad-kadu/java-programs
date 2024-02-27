
//WAP to sum values of an array
import java.util.Arrays;

public class ArrayTwo {

    // function for summing the array
    public static int sumArray(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        System.out.println("The given array is " + Arrays.toString(arr));
        System.out.println("The sum of the given array is " + sumArray(arr));
    }
}

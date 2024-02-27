
//WAP to calculate the average value of array elements.
import java.util.Arrays;

class ArrayThree {

    // average function
    public static int aveVal(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }

        int average = sum / arr.length;
        return average;
    }

    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        System.out.println("The given array is " + Arrays.toString(arr));

        System.out.println("The average value of the array elements is " + aveVal(arr));
    }
}


//Find index and replacing element into an array
import java.util.*;

public class ArrayEight {

    // Finding index and replacing element in an array
    public static void insArray(int arr[], int index, int val) {

        for (int i = 0; i < arr.length; i++) {
            if (index == i) {
                arr[i] = val;
            }
        }

        System.out.println("Array after inserting new element" + Arrays.toString(arr));
    }

    public static void main(String arr[]) {
        Scanner sc = new Scanner(System.in);
        int orgarr[] = { 25, 14, 56, 15, 36, 56, 77, 18, 29, 49 };
        System.out.println("The given array is " + Arrays.toString(orgarr));

        System.out.println("Enter the index where you want to insert element in the array");
        int index = sc.nextInt();

        if (index >= orgarr.length || index < 0) {
            System.out.println("The index you choosed is pointing out of the array");
        } else {
            System.out.println("Enter the value you want to insert");
            int val = sc.nextInt();
            insArray(orgarr, index, val);
        }
    }
}

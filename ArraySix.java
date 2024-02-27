
//WAP to remove a specific element from an array
import java.util.Scanner;
import java.util.Arrays;

public class ArraySix {

    // Remove Elements From The Array
    public static void removeElem(int arr[], int elem) {
        boolean found = false;
        int indextoremove = -1;

        // To find the element and it's index
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == elem) {
                found = true;
                indextoremove = i;
                break;
            }
        }

        if (found) {
            int newarr[] = new int[arr.length - 1];
            int moveindex = 0;
            for (int i = 0; i < arr.length; i++) {
                if (i != indextoremove) {
                    newarr[moveindex++] = arr[i];
                }
            }

            System.out.println("The new Array after removing " + elem + " is " + Arrays.toString(newarr));
        } else {
            System.out.println("The element is not found");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = { 25, 14, 56, 15, 36, 56, 77, 18, 29, 49 };

        System.out.println("Enter the element you want to remove from the array");
        int elem = sc.nextInt();

        removeElem(arr, elem);
    }
}

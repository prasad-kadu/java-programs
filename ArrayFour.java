
//WAP To Test if an array contains a specific value
import java.util.Scanner;

class ArrayFour {

    // searching algorithm
    static void searchArray(int arr[], int val) {
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (val == arr[i]) {
                found = true;
            }
        }

        if (found == true) {
            System.out.println("The array contains the value you were searching for!");
        } else {
            System.out.println("The array doesn't contain the value you were looking for!");
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int arr[] = { 1789, 2035, 1899, 1456, 2013, 1458, 2458, 1254, 1472, 2365, 1456, 2265, 1457, 2456 };

        System.out.println("Enter the value you want to search in the array");
        int val = sc.nextInt();

        searchArray(arr, val);
    }
}

//WAP to find the index of an array element
import java.util.Scanner;

class ArrayFive {

    // Retriving Index
    public static void indexArray(int arr[], int val) {
        boolean found = false;
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (val == arr[i]) {
                found = true;
                index = i;
            }
        }

        if (found == true) {
            System.out.println("Index position of " + val + " is: " + index);
        } else {
            System.out.println("The array doesn't contain the value");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = { 1789, 2035, 1899, 1456, 2013, 1458, 2458, 1254, 1472, 2365, 1456, 2265, 1457, 2456 };

        System.out.println("Enter the value to get the index");
        int val = sc.nextInt();

        indexArray(arr, val);
    }
}
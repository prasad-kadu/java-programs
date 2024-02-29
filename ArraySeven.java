
//Write a java program to copy an array by iterating the array
import java.util.Arrays;

class ArraySeven {

    // copy array method
    public static void copyArray(int arr[]) {
        int copyarr[] = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            copyarr[i] = arr[i];
        }

        System.out.println("The element in the new array after copying" + Arrays.toString(copyarr));
    }

    public static void main(String args[]) {
        int arr[] = { 25, 14, 56, 15, 36, 56, 77, 18, 29, 49 };
        System.out.println("The given array elements are " + Arrays.toString(arr));

        copyArray(arr);
    }
}

/*
 * The error you encountered, java.lang.ArrayIndexOutOfBoundsException, occurred
 * because you're using the enhanced for loop (for (int i : arr)) to iterate
 * over the elements of the array arr, but then you're using i as an index to
 * access elements of arr and copyarr.
 * 
 * In Java, when you use the enhanced for loop (for (int i : arr)), i directly
 * represents the elements of the array, not their indices. Therefore, you're
 * trying to access elements of arr and copyarr using values like 25, 14, etc.,
 * which are not valid indices for these arrays.
 */
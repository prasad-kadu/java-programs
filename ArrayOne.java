
//Sort a numberic array and a string array
import java.util.Arrays;

class ArrayOne {

    // sorting function for integer array
    public static int[] sortArray(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                // swap
                if (arr[j] > arr[i]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        return arr;
    }

    // sorting function for string array
    public static String[] sortString(String srr[]) {
        // bubble sort
        for (int i = 0; i < srr.length - 1; i++) {
            for (int j = 0; j < srr.length - i - 1; j++) {
                if (srr[j].compareTo(srr[j + 1]) > 0) {
                    String temp = srr[j];
                    srr[j] = srr[j + 1];
                    srr[j + 1] = temp;
                }
            }
        }
        return srr;
    }

    public static void main(String[] args) {
        int arr[] = { 1789, 2035, 1899, 1456, 2013 };
        System.out.println("The given numeric array is " + Arrays.toString(arr));

        int sortedArr[] = sortArray(arr);
        System.out.println("The sorted array is " + Arrays.toString(sortedArr));

        String srr[] = { "Java", "Python", "PHP", "C#", "C Programming", "C++" };
        System.out.println("The given string array is " + Arrays.toString(srr));

        String sortedString[] = sortString(srr);
        System.out.println("The sorted string array is " + Arrays.toString(sortedString));

    }

}
package Recursion;

public class Helper {
    // true if arr[current] doesn't match with any of the characters after arr[begin]
    public static boolean checkDuplicates(char[]arr, int begin, int current) {
        for (int i = begin; i < current; i++) {
            if (arr[i] == arr[current]) {
                return false;
            }
        }
        return true;
    }
    public static void swap(char[] arr, int i, int j) {
        char x = arr[i];
        arr[i] = arr[j];
        arr[j] = x;
    }

}




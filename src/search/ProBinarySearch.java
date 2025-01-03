package search;

import java.util.Scanner;

public class ProBinarySearch {
    static public Scanner sc = new Scanner(System.in);

    public static boolean binarySearch(int[] arr, int key, int start, int end) {
        if (end >= start) {

            int mid = (start + end) / 2;
            if (key == arr[mid]) return true;
            if (key > arr[mid]) {
                return binarySearch(arr, key, mid + 1, end);
            } else {
                return binarySearch(arr, key, start, mid - 1);
            }
        }
        return false;

    }


    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int key;
        key = sc.nextInt();
        boolean isFound = binarySearch(arr, key, 0, arr.length - 1);
        if (isFound) {
            System.out.println("Key Found");
        } else {
            System.out.println("Not Found");
        }
    }
}
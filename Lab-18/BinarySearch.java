//Write a program to implement a Binary Search using Array.

import java.util.*;

public class BinarySearch{
    public static int binarySearch(int[] arr, int x) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == x) {
                return mid;
            }
            if (arr[mid] < x) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner (System.in);
       System.out.println("Enter size of array");
       int size = sc.nextInt();
       int[] arr = new int[size];
       System.out.println("Enter elements of array");
       for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
       }
       System.out.println("Enter element of array to be searched");
       int x = sc.nextInt();
        int result = binarySearch(arr, x);
        System.out.println("Index of " + x + ": " + result);
    }   
}    
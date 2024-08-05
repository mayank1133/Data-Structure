// 92. Write a program to implement Bubble using Array.
import java.util.*;
public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int arr [] = new int [n];
        for (int i = 0; i<arr.length; i++) {
            System.out.println("Enter the element at index " + i);
            arr[i] = sc.nextInt();
        }
        System.out.println("Original Array: ");
        for (int i = 0 ; i < arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }
        bubbleSort(arr);
        System.out.println("Sorted array :");
        for (int i = 0 ; i < arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void bubbleSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
       
    }
}
    
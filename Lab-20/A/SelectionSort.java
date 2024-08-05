// 94. Write a program to implement Selection Sort using Array.
import java.util.*;
public class SelectionSort{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of arrays :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<arr.length;i++) {
            System.out.println("Enter elements of array at index:" +i);
            arr[i]=sc.nextInt();
        }
        System.out.println("ORIGINAL ARRAY");
        for (int i = 0 ; i < arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
        insertionSort(arr);
        
        System.out.println("Sorted array through SELECTION SORT:");
        for (int i = 0 ; i < arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void insertionSort(int arr[]) {
        int n = arr.length;
        for (int i=1; i<n; ++i) {
            int x = arr[i];
            int j = i-1;
            while (j>=0 && arr[j] > x) {
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = x;
        }
    }
}


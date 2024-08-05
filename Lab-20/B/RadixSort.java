// 95. Write a program to implement Radix Sort using Array.
import java.util.*;
public class RadixSort{
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
        radixSort(arr);
        
        System.out.println("Sorted array through RADIX SORT:");
        for (int i = 0 ; i < arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void getMax(int[] arr){
        int max = arr[0];
        for (int i=1; i<arr.length; i++)
            if (arr[i] > max)
                max = arr[i];
        return max;
    } 
    public static void countSort(int arr[], int exp) {
        int n = arr.length;
        int output[] = new int[n];
        int i;
        int count[] = new int[10];
        Arrays.fill(count, 0);
        for (i = 0; i < n; i++)
            count[(arr[i]/exp)%10]++;
        for (i = 1; i < 10; i++)
            count[i] += count[i - 1];
        for (i = n - 1; i >= 0; i--) {
            output[count[(arr[i]/exp)%10] - 1] = arr[i];
            count[(arr[i]/exp)%10]--;
        }
        for (i = 0; i < n; i++)
            arr[i] = output[i];
    }
    public static void radixSort(int arr[]) {
        int max = getMax(arr);
        int exp = 1;
        while (max/exp > 0) {
            countSort(arr, exp);
            exp *= 10;
        }
    }
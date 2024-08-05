// Write a program to implement a Linear Search using Array.
import java.util.*;

public class linearSearch {
    public static void main(String[] args) {
            // Create a Scanner object to take input from the user.
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the size of the array: ");
            int size = sc.nextInt();
            // Create array to hold the elements of the array
            int[] arr = new int[size];
            System.out.println("Enter the elements of the array:");
            //read elements to stored im array  
            for (int i = 0; i < size; i++) 
            {
                arr[i] = sc.nextInt();
            }
            //read element to be searched from array
            System.out.print("Enter the element to search: ");
            int x = sc.nextInt();
            //code for searching element from array
            for (int i = 0; i < arr.length; i++) {
            if(x==arr[i]) 
            {
                System.out.println("the following element is found at index " + i);
            }
            else
            {
                System.out.println("Element not found");
            }
        }
    }
}
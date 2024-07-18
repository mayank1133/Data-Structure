//  Write a program to determine if an input character string is of the form aibi 
// where i >= 1 i.e., Number of ‘a’ should be equal to number of ‘b’. 
import java.util.*;

public class aibi_form {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to check if it is of the form a^ib^i: ");
        String input = scanner.nextLine();

        boolean result = checkAibi(input);

        if (result) {
            System.out.println("The input string \"" + input + "\" is of the form a^ib^i.");
        } else {
            System.out.println("The input string \"" + input + "\" is NOT of the form a^ib^i.");
        }

        scanner.close();
    }

    public static boolean checkAibi(String str) {
        int countA = 0;
        int countB = 0;

        // Count 'a's
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a') {
                countA++;
            } else if (str.charAt(i) == 'b') {
                countB++;
            } else {
                // If any character other than 'a' or 'b' is found, return false
                return false;
            }

            // If count of 'b's ever exceeds count of 'a's, return false
            if (countB > countA) {
                return false;
            }
        }

        // At the end, number of 'a's and 'b's should be equal and countB should be equal to countA
        return countA == countB;
    }
}
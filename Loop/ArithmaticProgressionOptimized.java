import java.util.Scanner;
// This code is an optimized version of the original code. It uses a single loop to calculate the terms of the arithmetic progression and prints them directly without storing them in an array. This reduces memory usage and improves performance for large inputs.

public class ArithmaticProgressionOptimized {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // creating the scanner object to take input from the user
        System.out.print("Please enter the first term of the AP: ");
        int firstTerm = sc.nextInt(); // taking the first term of the AP from the user
        System.out.print("Please enter the common difference of the AP: ");
        int commonDifference = sc.nextInt(); // taking the common difference of the AP from the user
        System.out.print("Please enter the number of terms you want to print: ");
        int numberOfTerms = sc.nextInt(); // taking the number of terms to be printed from the user

        sc.close(); // closing the scanner object

        for (int i = 1; i <= numberOfTerms; i++) {

            System.out.print(firstTerm + " ");
            firstTerm += commonDifference; // updating the first term by adding the common difference to it
            // This will print the first term and then update it for the next iteration
        }
    }
}

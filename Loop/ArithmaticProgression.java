import java.util.Scanner;
public class ArithmaticProgression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the first term of the AP: ");
        int firstTerm = sc.nextInt();
        System.out.print("Please enter the common difference of the AP:");
        int commonDifference = sc.nextInt();
        System.out.print("Please enter the number of terms you want to print: ");
        int numberOfTerms = sc.nextInt();
        sc.close();

        // Method 1

        for (int i = 0; i < numberOfTerms; i++) {
            System.out.print(firstTerm + (i * commonDifference) + " ");
        }

        System.out.println("\n \n");
        
        // Method 2
        
        int result = firstTerm;
        System.out.print(result + " ");
        for(int i = 1; i < numberOfTerms; i++) {
            result += commonDifference;
            System.out.print(result + " ");
        }
    }
}

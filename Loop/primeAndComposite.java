import java.util.Scanner;
public class primeAndComposite {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the number : ");
        int n = sc.nextInt();

        // for any composite number it has atleast 3 factors, we will run a loop, if find atleast 3 factors then we will brake the loop and tell that number is composite

        int NumberOfFactor = 0;
        for(int i = 1; i <= n ; i++) {
            if(n % i == 0) {
                NumberOfFactor += 1;
                if(NumberOfFactor == 3) {
                    break;
                }
            }
        }
        if(NumberOfFactor == 3)
            System.out.println("The given number is composite");
        else System.out.println("The given number is prime");
        
        System.out.println("\n\n");

        // Method 2;
        // we will run a loop from 2 to (n-1) because 1 and the number itself if a factor. Later when we will get another factor we will print that the number is composite and brake the loop

        for (int j = 2; j <= (n-1); j++) {
            if (n % j == 0) {
                System.out.println("The given number is composite.");
                break;
            }
        }

        //but the previous code do not tell whether the number is prime 

        boolean IsPrime = false;// false indicates that the number is prime

        for (int j = 2; j <= (n-1); j++) {
            if (n % j == 0) {
                IsPrime = true; // true indicates that the number is composite as we got a factor
                break;
            }
        }

        if (n == 1) {
            System.out.println("The number is neither prime nor composite. ");
        }
        else if (IsPrime == true) {
            System.out.println("The given number is composite. ");
        }
        else System.out.println("The given number is prime. ");

        // To wrtie an efficient code, we can go till sqrt.

        for (int k = 2; k <= Math.sqrt(n); k++) {
            if (n % k == 0) {
                IsPrime = true; // true indicates that the number is composite as we got a factor
                break;
            }
        }

        if (n == 1) {
            System.out.println("The number is neither prime nor composite. ");
        }
        else if (IsPrime == true) {
            System.out.println("The given number is composite. ");
        }
        else System.out.println("The given number is prime. ");

    }
}

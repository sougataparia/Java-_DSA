import java.util.Scanner;

public class HighestFactorOptimized {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the number : ");
        int n = sc.nextInt();

        int HighestFactor = 1;
        for(int i = n-1; i >= 1; i--) {
            if(n % i == 0) {
                HighestFactor = i;
                break;
            }
        }

        System.out.println("The highest factor of the given number " + n + " is : " + HighestFactor);

        sc.close();
    }
}

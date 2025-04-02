import java.util.Scanner;

public class HighestFactor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the number : ");
        int n = sc.nextInt();
        sc.close();

        int HighestFactor = 1;

        for(int i = 1; i < n; i++) {
            if(n % i == 0) {
                // System.out.print(i);
                // if(i != n) {
                //     System.out.print(", ");

                HighestFactor = i;
                }
            }

            System.out.println("The highest factor of the given number is : " + HighestFactor);
        }
    }


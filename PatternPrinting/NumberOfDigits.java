import java.util.Scanner;

public class NumberOfDigits {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the number : ");
        int Number = sc.nextInt();
        int Number1 = Number;
        int numberOfDigits = 0;
        while(Number != 0) {
            Number = Number / 10;
            numberOfDigits++;
        }

        System.out.println("The number of digits of the given number " + Number1 + " is : " + numberOfDigits);

        sc.close();
    }
}
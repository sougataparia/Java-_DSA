import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the base number: ");
        int base = sc.nextInt();
        System.out.print("Please enter the exponent:");
        int exponent = sc.nextInt();
        int result = 1;

        // condition for not indeterminate form 

        if (base == 0 && exponent == 0) {
            System.out.println("0 raised to the power of 0 is not defined");
        }
        else {
        for (int i = 1;i <= exponent; i++) {
            result *= base;
        }

        System.out.println(base + " raised to the power of " + exponent + " = " + result);
    }
    
    }
}
import java.util.Scanner;
public class TableOfN {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to print the table of: ");
        int number = sc.nextInt();
        for (int i = number; i <= number*10; i += number) {
            System.out.println(number + " * " + i/number + " = " + i );
        }
        sc.close();

        // Method 2 using if else
        System.out.println("\n \n");
        for (int i = number; i <= number*10; i++) {
            if(i % number == 0) {
                System.out.print(i + " ");
            }
        }
   } 
}

import java.util.Scanner;

public class Factors {
  public static void main(String []args) {

    Scanner sc = new Scanner(System.in);

    int n;
    System.out.print("Please enter the number : ");
    n = sc.nextInt();

    sc.close();

    System.out.print("The factors of the given number " + n + " is : ");

    for(int i = 1; i <= n; i++) {
        if(n % i == 0) {
            System.out.print(i);
            if(i != n) {
                System.out.print(", ");
            }
        }
    }
  }  
}

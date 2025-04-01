import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int number = sc.nextInt();
        sc.close();
    
        int temp = number;

        int i = 0;
        while(temp != 0) {
            temp /= 10;
            i++;
        }

        System.out.println("The number of digits in the number is : " + i);

        int[] num = new int[i];
        temp = number;

        for(int j = 0; j <i ; j++) {
            num[j] = temp % 10;
            temp /= 10;
        }
        int[] num2 = new int[i];
        for(int j = i; j > 0; j--) {
            num2[i-j] = num[j-1];
        }

        if(num2 == num) {
            System.out.println("The number is a palindrome");
        } else {
            System.out.println("The number is not a palindrome");
        }
    }
}

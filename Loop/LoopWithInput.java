// here we will take input from the user for how many numbers of times to print

import java.util.Scanner;

public class LoopWithInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number of times you want to print your name: ");
        int n = sc.nextInt();
        for(int i = 1; i<= n; i++) {
            System.out.println(i + " Sougata");
        }

        sc.close();
    }
}

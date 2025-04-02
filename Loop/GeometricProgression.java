import java.util.Scanner;
public class GeometricProgression {
    public static void main(String[] args) {
        // Method 1
        Scanner sc = new Scanner(System.in);

        int a = 5; int r = 2; int n = 5;
        for(int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            a *= r; // a = a * r;
        }
        System.out.println("\n \n");

    }
}

public class EvenNumber {
    public static void main(String[] args) {
        int number = 100;
        for (int i = 1; i <= number; i++) {
            if(i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

        // Now lets try to print using while loop
        System.out.println("\n\n");
        System.out.println("\nUsing while loop");
        int i = 1;
        while(i <= number) {
            if(i % 2 == 0) {
                System.out.print(i + " ");
            }
            i++;
        }

        // Now let go by continue statement
        System.out.println("\n\n");
        System.out.println("\nUsing continue statement");

        for (int j = 1; j <= number; j++) {
            if(j % 2 != 0) {
                continue;
            }
            else System.out.print(j + " ");
        }

        // Now lets go by increasing the value of variable by two 
        System.out.println("\n\n");
        System.out.println("\nIncreasing the value of variable by 2");
        for (int k = 2; k <= number; k+=2) {
            System.out.print(k + " ");
        }
    }
}

public class TableOfNineteen {
    public static void main(String[] args) {

        // printing the table of 19
        int number = 19;
        for (int i = 1; i <= 10; i++) {
            int result = number * i;
            System.out.println(number + " * " + i + " = " + result);
        }

        System.out.println("\n \n");

        // Method 2 using if else
        for (int i = 1; i <= 190; i++) {
            if (i % 19 == 0) {
                System.out.print(i + " ");
            }
        }

        // Method 2 with little optimization using if else
        System.out.println("\n \n");
        for (int i = 19; i <= 190; i += 19) {
            System.out.print(i + " ");
        }
            
        }
    }

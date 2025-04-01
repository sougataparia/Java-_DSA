public class DivisibleByThree {
    public static void main(String []args){
        int number = 100;

        // Method 1
        for (int i = 1; i <= number; i++) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
            }
        }

        // Method 2
        System.out.println("\n using the method 2; printing the numbers divisible by 3");
        int lowestNumber;
        for (int i=1; ; i++) {
            if(i % 3 == 0) {
                lowestNumber = i;
                break;
            }
        }
        for (int i = lowestNumber; i <= number; i+=3) {
            System.out.print(i + " ");
        }
    }
}

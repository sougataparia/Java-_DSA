public class WhileLoop {
    // normal syntax only

    public static void main(String[] args) {
        int i = 1;
        while(i != 12) {
            System.out.println("hello sougata " + i);
            i++;
        }

        System.out.println("\n\n");

        // making a for loop as while loop
        int j = 1;
        for(;j != 12; ) {
            System.out.println("hello sougata " + j);
            j++;
        }

        // in java while loop only takes boolean value in while condition section. you can not assign the value here.

        // int k;
        // while(k = 10){
        //     System.out.println(k);
        // }
    }
}

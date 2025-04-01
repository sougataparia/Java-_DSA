public class First {
    public static void main(String[] args){

        // Q: Store a roll number
        int rollNumber = 19;

        // Q: store a  person's name
        String name = "Sougata Paria";

        // Q : Store 5 roll numbers
        int rollNumber1 = 1;
        int rollNumber2 = 13;
        int rollNumber3 = 7;
        int rollNumber4 = 17;

        // syntax for Array
        // datatype[] arrayName = new datatype[size];

        // store roll numbers

        int[] rollNumbers1 = new int[5]; //declaration only
        // directly initialize

        int[] rollNumbers2 = {1, 13, 7, 17, 19};
        //the datatype described is the datatype of the each element of the array
        // the array can not contain elements of different datatypes

        // int [] rollNumbers3 = {5, 6, "sougata", 7, 8};

        int[] rollNumbers3; // declaration of array. rollNumbers3 is getting defined in the stack.

        rollNumbers3 = new int[5]; // initialization of array in the heap memory. actual object is being created in the heap memory

        
    }
}
package Day11_Scanner;


import java.util.Scanner;

public class DoubleInput {
    public static void main(String[] args) {

        //1. step create a Scanner Object
        Scanner doubleInput=new Scanner(System.in);

        // 2. step warn the user about the input type

        System.out.println("Enter a double number");

        // 3. step create a variable and get the input data

        double userDoubleInput= doubleInput.nextDouble();

        // 4. step process the data
        // print the data

        System.out.println("user double input data is "+ userDoubleInput);
    }
}

package Day11_Scanner;


import java.util.Scanner;

public class IntegerInput {
    public static void main(String[] args) {

        // I am going to request an integer input from the user
        //and print the result

        //1.Step Create Object
        Scanner integerInput=new Scanner(System.in);

        // 2. Step Tell the user to enter the exact input we want
        System.out.println("Enter an integer:");

        // 3. Step create a variable and get an integer input

        int userIntegerInput= integerInput.nextInt();

        //4.Step Process the data

        System.out.println("The user integer input is "+ userIntegerInput);
    }
}


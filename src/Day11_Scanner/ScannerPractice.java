package Day11_Scanner;

import java.util.Scanner;

public class ScannerPractice {
    public static void main(String[] args) {

        // 1. Step: Create a Scanner Object
        Scanner userInput=new Scanner(System.in);

        // 2. Step: Print a tutorial sentence for the user
        // Tell the user what to do

        System.out.println("Enter your username:");

        // 3. Step: Create a variable to save the input
        // and type userInput.nextline() to get an input from the user

        String userName=userInput.nextLine();

        //4. Step Process the data

        System.out.println("The username is "+ userName);
    }
}

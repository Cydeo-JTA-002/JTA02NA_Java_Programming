package Day20_LoopsPart2;

import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {

//        for (int i = 0; i < 10; i++) {
//
//        }
//
//        int num=0;
//        while (num<=3){
//
//        }
//

        Scanner input = new Scanner(System.in);
        int num=0;
        do{
            System.out.println("Please enter a number, I will give you the square of that number");
            System.out.println("Please enter 0 to exit the program");
            num=input.nextInt();

            System.out.println("Square of " + num + " is = " + (num*num) );

        }while(num !=0);

        System.out.println("You exited the program");



    }
}

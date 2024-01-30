package Day20_LoopsPart2;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {

        // numbers from 1 to 10

        for (int i = 1; i <= 10 ; i++) {
            System.out.print(i + " ");
        }

        System.out.println();
        int num=1;
        while (num<=10){

            System.out.print(num + " ");
            num++;

        }

        System.out.println("_______________________");

        System.out.println("Hey user please eneter a number, i will print all the numbers down to zero");

        Scanner input = new Scanner(System.in);

        int i=input.nextInt();

        while (i>=0){
            System.out.print(i + " ");
            i--;

        }


    }
}

package Tasks.scanner;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        // 1. create a scanner object
        Scanner scan=new Scanner(System.in);

        System.out.println("street number");
        // get the integer data
        String nInt=scan.next();
        scan.nextLine();  // if we add this line in between
        // .next() and .nextLine() it fixes the nextLine() skipping issue.
        System.out.println("building name");
        String st=scan.nextLine();

        System.out.println(st+nInt);
    }
}

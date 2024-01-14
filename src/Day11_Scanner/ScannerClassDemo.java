package Day11_Scanner;

import java.util.Scanner;

public class ScannerClassDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name");
        String name=sc.nextLine();

        System.out.println("Enter your last name");
        String lastName=sc.nextLine();

        System.out.println("Enter your birthyear");
        int birthYear=sc.nextInt();

        int currentYear= 2023;
        int age=currentYear-birthYear;


        System.out.println("Your name is "+name+ "\n"
        + "Your last name is "+ lastName +"\n"
        + "Your age is " + age);
    }
}

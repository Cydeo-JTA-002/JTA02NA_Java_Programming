package Day08_IfStatements;

public class IfElseStatements {
    public static void main(String[] args) {

        int num =70;  // decide if the number is positive or negative

        if (num > 0){

            System.out.println(num + " is a positive number");
        }else{

            System.out.println(num + " is a negative number");
        }


        System.out.println("continue executing the rest of the code");


        System.out.println("***********************");

        // decide if the number is EVEN or ODD
        int num2=7;
       // 7 / 2 = 3    (3X2) + 1 = 7


        if ( num2 % 2 == 0 ){
            System.out.println(num2 + " is an EVEN number");
        }else{
            System.out.println(num2 + " is an ODD number");
        }

        System.out.println("*****************");

        // min age for driver license is 16

        int age = 11;

        if (age >= 16){

            System.out.println("You can get a driver license");
        }else{
            System.out.println("You can not get a driver license");

        }
    }
}

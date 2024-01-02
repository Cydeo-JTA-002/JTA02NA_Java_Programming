package Day08_IfStatements;

public class SingleIf {

    public static void main(String[] args) {

        int num = -15;

        System.out.println("our game started");

        System.out.println("My avatar is Alex");

        if (num > 0) {
           // -15 > 0   false
            System.out.println(num + " is a positive number");

        }

        System.out.println(" We are out of if statement");

        System.out.println(" game is ongoing");


        System.out.println("***********************************");

        // CydeoJR programs age limit is 12-17

        int age = 7;

        if (age>=12 && age<=17) {
              // true && true

            System.out.println("student can join CydeoJR program");
        }

        System.out.println("Cydeo welcomes all the students older than 18");


    }


}

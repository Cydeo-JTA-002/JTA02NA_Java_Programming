package Day21_LoopsPart3_Branching;

public class BreakStatement {
    public static void main(String[] args) {

        for (int i = 0; i < 3; i++) {

            System.out.println("statement 1");
            System.out.println("statement 2");
            if(i==1) {
                break;
            }
            System.out.println("statement 3");
            System.out.println("statement 4");
            System.out.println("____________");

        }

        System.out.println("you are out of loop");

        System.out.println("----------------------------------");

        int i = 0;

        while (i<5){


            System.out.println(i);
            if (i==3){
                break;
            }

            i++;
        }

        System.out.println("You are out of loop");

    }
}

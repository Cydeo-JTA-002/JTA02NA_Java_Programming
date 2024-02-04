package Day21_LoopsPart3_Branching;

public class ContinueStatement {
    public static void main(String[] args) {

        for (int i = 1; i <=5; i++) {

            if (i==3){
                continue;
            }
            System.out.println(i);
        }
        System.out.println("You are out of loop");

        System.out.println("------------------------------");

        String str="Hello Cydeo, how are you";

        for (int i = 0; i < str.length(); i++) {


            if(str.charAt(i) == ' '){
                continue;

            }
            System.out.print(str.charAt(i));

        }
        System.out.println();
        System.out.println("out");





    }
}

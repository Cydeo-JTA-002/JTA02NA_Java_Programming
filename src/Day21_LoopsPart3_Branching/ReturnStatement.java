package Day21_LoopsPart3_Branching;

public class ReturnStatement {
    public static void main(String[] args) {

        System.out.println("Hello Cydeo");
        System.out.println("hello world");


        for (int i = 0; i < 6; i++) {

            if (i==3){
                return;
            }


            System.out.println(i);

        }

        System.out.println("hi");
        System.out.println("hi world");





    }


}

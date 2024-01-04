package Day09_ElseIf_NestedIf;

public class ElseIfPractice2 {
    public static void main(String[] args) {

        int age =67;


        if (age > 60){
            System.out.println("You are a Senior");
        }else if(age>20){
            System.out.println("You are an Adult");
        }else if(age>13){
            System.out.println("You are a Teenager");
        }else if(age > 4){
            System.out.println("You are a Child");
        }else{
            System.out.println("You are a baby");
        }


        System.out.println("**************");
        System.out.println("We are out of our Age Group Program");
        System.out.println("These are extra lines of code");




    }
}

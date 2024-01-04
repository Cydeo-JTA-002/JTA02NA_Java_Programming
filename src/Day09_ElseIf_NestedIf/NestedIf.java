package Day09_ElseIf_NestedIf;

public class NestedIf {
    public static void main(String[] args) {

        // please enter a valid age if you want to use my Age Group Program

        int age = 3;

        if (age > 0 && age < 120) {
            //System.out.println("You can use age Group Program, and learn Senior, Baby, teenager etc.");


            if (age > 60) {
                System.out.println("You are a Senior");
            } else if (age > 20) {
                System.out.println("You are an Adult");
            } else if (age > 13) {
                System.out.println("You are a Teenager");
            } else if (age > 4) {
                System.out.println("You are a Child");
            } else {
                System.out.println("You are a baby");
            }


        } else {
            System.out.println("not a Valid Age, please enter a correct one!");
        }


        System.out.println("Age Group Program ended");

    }

}

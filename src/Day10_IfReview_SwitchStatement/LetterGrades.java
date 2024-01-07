package Day10_IfReview_SwitchStatement;

public class LetterGrades {
    public static void main(String[] args) {

        // Please enter a number between 0 and 100
        int grade = 35;
        char letterGrade = 'Q';
        int cCouter = 0;
        int aCouter = 0;

        if (grade > 100 || grade < 0) {

            System.out.println("Please enter a Valid Grade!");
        } else {

            if (grade >= 90) {
                letterGrade = 'A';
                aCouter++;
            } else if (grade >= 80) {
                letterGrade = 'B';
            } else if (grade >= 70) {
                letterGrade = 'C';
                cCouter++;
            } else if (grade >= 60) {
                letterGrade = 'D';
            } else if (grade <= 59) {
                letterGrade = 'F';
            }
            System.out.println("You get " + letterGrade);
        }

        System.out.println("----------------------------");

        // A,B,C,D  Pass
        // F         Fail

//        if (letterGrade=='A' || letterGrade=='B' ||  letterGrade=='C' || letterGrade=='D' ) {
//            System.out.println("You Pass");
//        }else {
//            System.out.println("You Fail");
//        }


        if (letterGrade !='F') {
            System.out.println("You Pass");
        } else {
            System.out.println("You Fail");
        }                      //Ctrl+alt+l

    }




}




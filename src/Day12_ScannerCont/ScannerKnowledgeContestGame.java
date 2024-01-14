package Day12_ScannerCont;

import java.util.Scanner;
//1.step create a scanner object
//2. Make an explanation of the game
//3. get a boolean answer as either true or false to accept the contest
//4. we will continue rest of the code if toCompete is true and
// we will stop if toCompete is false
//5. Lets create a counter which will count the correct answers
//--Question1-------------------------
//6. ask the first question
// 7. save the real answer of the question
// 8. get the answer from the user
//--Question2-------------------------
//9. ask the second question
// 10. save the real answer of the question
// 11. get the answer from the user
//--Question3-------------------------
//12. ask the third question
// 13. save the real answer of the question
// 14. get the answer from the user
//--Question4-------------------------
//15. ask the forth question
// 16. save the real answer of the question
// 17. get the answer from the user
//--Question5-------------------------
//18. ask the fifth question
// 19. save the real answer of the question
// 20. get the answer from the user
// if the number of correct answers is greater than 0, say "Good Job!"

public class ScannerKnowledgeContestGame {
    public static void main(String[] args) {

        //1.step create a scanner object
        Scanner scan=new Scanner(System.in);

        //2. Make an explanation of the game

        System.out.println("Welcome to the knowledge contest game! \n If you accept you will be asked 5 questions \n " +
                "If you accept the challenge type true, and if not type false ");

        //3. get a boolean answer as either true or false to accept the contest
        boolean toCompete=scan.nextBoolean();

        //4. we will continue rest of the code if toCompete is true and
        // we will stop if toCompete is false

        if(toCompete==true){
            //5. Lets create a counter which will count the correct answers
            int counterOfCorrectAnswers=0;

            //--Question1-------------------------
            //6. ask the first question
            System.out.println("Question1_: A car travels 120 km in 2 hours. What is the average speed in kilometers per hour?");
            // 7. save the real answer of the question
            int answer1=60;
            // 8. get the answer from the user
            int answer1_input= scan.nextInt();
            if(answer1_input==answer1){
                counterOfCorrectAnswers++;
                System.out.println("You did it right!");
            }else{
                System.out.println("Your answer is wrong! Lets look at next question!");
            }
            //--Question2-------------------------
            //9. ask the second question
            System.out.println("Question2_: How many days are there in February in a non-leap year?");
            // 10. save the real answer of the question
            int answer2=28;
            // 11. get the answer from the user
            int answer2_input= scan.nextInt();
            if(answer2_input==answer2){
                counterOfCorrectAnswers++;
                System.out.println("You did it right!");
            }else{
                System.out.println("Your answer is wrong! Lets look at next question!");
            }
            //--Question3-------------------------
            //12. ask the third question
            System.out.println("Question3_: How many weeks are there in a year?");
            // 13. save the real answer of the question
            int answer3=52;
            // 14. get the answer from the user
            int answer3_input= scan.nextInt();
            if(answer3_input==answer3){
                counterOfCorrectAnswers++;
                System.out.println("You did it right!");
            }else{
                System.out.println("Your answer is wrong! Lets look at next question!");
            }
             //--Question4-------------------------
            //15. ask the forth question
            System.out.println("Question4_: The earth has 1 moon. How many moons does Jupiter have?");
            // 16. save the real answer of the question
            int answer4=79;
            // 17. get the answer from the user
            int answer4_input= scan.nextInt();
            if(answer4_input==answer4){
                counterOfCorrectAnswers++;
                System.out.println("You did it right!");
            }else{
                System.out.println("Your answer is wrong! Lets look at next question!");
            }
            //--Question5-------------------------
            //18. ask the fifth question
            System.out.println("Question5_: There are 26 letters in English alphabet. How many vowels are there in English alphabet?");
            // 19. save the real answer of the question
            int answer5=5;
            // 20. get the answer from the user
            int answer5_input= scan.nextInt();
            if(answer5_input==answer5){
                counterOfCorrectAnswers++;
                System.out.println("You did it right!");
            }else{
                System.out.println("Your answer is wrong! Lets look at next question!");
            }
            System.out.println("You answered "+ counterOfCorrectAnswers+ " questions correct!");
            // if the number of correct answers is greater than 0, say "Good Job!"

            if(counterOfCorrectAnswers>0){
                System.out.println("Good Job!");
            }
        }else {
            System.out.println("See you next time!");
        }
    }
}

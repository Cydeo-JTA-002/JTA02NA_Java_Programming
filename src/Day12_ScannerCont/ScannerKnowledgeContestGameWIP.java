package Day12_ScannerCont;


import java.util.Scanner;

public class ScannerKnowledgeContestGameWIP {
    public static void main(String[] args) {
//1.step create a scanner object
        Scanner scan=new Scanner(System.in);

//2. Make an explanation of the game
        System.out.println("Welcome to Knowledge Contest Game!!!!!" +
                "\n You will be asked 5 questions \n" +
                "if you want to join type true, if not type false");
//3. get a boolean answer as either true or false to accept the contest
        boolean toCompete=scan.nextBoolean();
//4. we will continue rest of the code if toCompete is true and
// we will stop if toCompete is false
        if(toCompete==true){
            //PUT THE CONTEST LINES HERE
            //5. Let's create a counter which will count the correct answers
            int counter=0;

//--Question1-------------------------
//6. ask the first question
            System.out.println("A car travels 120 km in 2 hours. What is the average speed in kilometers per hour?");

// 7. save the real answer of the question
            int answer1=60;
// 8. get the answer from the user
            int answer1input=scan.nextInt();
// compare answer and answerinput and if they are equal
//        increase  counter by 1 and
//        print "the answer is correct!"

      if(answer1input==answer1){
          counter++;  // counter=counter+1  // counter+=1;
          System.out.println("Correct answer!");
      }else{
          System.out.println("The answer is wrong! Keep pushing!");
      }

//--Question2-------------------------
//9. ask the second question
            System.out.println("How many days are there in February in a non-leap year?");
// 10. save the real answer of the question
            int answer2=28;
// 11. get the answer from the user
            int answer2input=scan.nextInt();
// compare answer and answerinput and if they are equal

      //        increase  counter by 1 and
      //        print "the answer is correct!"
      if(answer2input==answer2){
          counter++;
          System.out.println("correct answer!");
      }else{
          System.out.println("The answer is wrong! Keep pushing!");
      }
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
            System.out.println("Thanks for joining the contest! ");
           if(counter>0){
               System.out.println("Good Job!");
           }

        }else{
            System.out.println("No worries, if you like challenge, come back later!!!");
        }
    }
}

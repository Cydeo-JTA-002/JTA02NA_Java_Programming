package Day17_CustomMethodsContinue;

public class AverageScoreCalculation {
    public static void main(String[] args) {
// Lets use this getAverageScore() method in 2 students data
        // student1 scores 56, 67, 75, 77
        // student2  scores 67, 77, 75, 87
        double averageMathScoreOfStudent1=getAverageScore(56,67,75,77);
        double averageMathScoreOfStudent2=getAverageScore(67,77,75,87);
        System.out.println("averageMathScoreOfStudent1 = " + averageMathScoreOfStudent1);
        System.out.println("averageMathScoreOfStudent2 = " + averageMathScoreOfStudent2);


    }
    /*
     *
     * Create a method naming getAverageScore()
     * as a return method returning double
     * accepting 4  double scores naming score1 score2 score3 and score4 of one class for one student
     *
     * */
     public static double  getAverageScore(double score1,double score2,double score3,double score4){
         double averageScore=(score1+score2+score3+score4)/4;
         return averageScore;
     }
}

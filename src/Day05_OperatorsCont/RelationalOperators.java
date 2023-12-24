package Day05_OperatorsCont;

public class RelationalOperators {
    public static void main(String[] args) {
        
        //passing grade for Math is 50 out of 100
        
        int acceptableLowestGradeToPassTheClass=50;
        int gradeA=85;
        
        int grade1=23;
        int grade2=49;
        int grade3=50;
        int grade4=55;
        int grade5=90;
        
        //-------
        
        //lets check failing students
        boolean failingStatus=grade1<50;
        System.out.println("failingStatus = " + failingStatus);

        //------------------------------

        System.out.println("grade1<50 = " + (grade1 < 50));
        System.out.println("grade2<50 = " + (grade2 < 50));
        System.out.println("(grade3<50) = " + (grade3 < 50));
        System.out.println("(grade4<50) = " + (grade4 < 50));
        System.out.println("(grade5<50) = " + (grade5 < 50));


        //////////////////////////////////////////////////////
        System.out.println("////////////////////////////////////////////////////");

        // NOT EQUAL

        int number1=5;
        int number2=10;

        // check if these two numbers are not equal???
        // if they are not equal I want to see true,
        // if they are equal i want to see false

        System.out.println("(number1!=number2) = " + (number1 != number2));

        System.out.println("////////////////////////////////////////////");

        // bid=2300

        int biddingPrice=2300;
        int price1=2000;
        int price2=1900;
        int price3=2100;
        int price4=2300;
        int price5=2400;
        int price6=2300;

        System.out.println("(price1==biddingPrice) = " + (price1 == biddingPrice));
        System.out.println("(price2==biddingPrice) = " + (price2 == biddingPrice));
        System.out.println("(price3==biddingPrice) = " + (price3 == biddingPrice));
        System.out.println("(price4==biddingPrice) = " + (price4 == biddingPrice));
        System.out.println("(price5==biddingPrice) = " + (price5 == biddingPrice));
        System.out.println("(price6==biddingPrice) = " + (price6 == biddingPrice));

    }
    
}

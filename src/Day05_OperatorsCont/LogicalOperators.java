package Day05_OperatorsCont;

public class LogicalOperators {
    public static void main(String[] args) {

        System.out.println(3+5*6);

        //lets add 3 to 5 then multiply it by 6
        // then answer is to use a paranthesis
        System.out.println( (3+5)*6        );  //48

        //   && example
        int passingGrade=50;
        int grade1=50;
        int grade2=51;
        // if both students pass teacher will smile
        System.out.println(((grade1 >= passingGrade) && (grade2 >= passingGrade)));

        //  || example

        // looking at least 1 true

        // bidding example
         int biddingPrice=2000;
         int price1=1900;
         int price2=2000;
         // am i gonna sell or not 1 bidding price is ok for me
        // in OR ops you hear at least

        // in AND you hear ALL

        System.out.println(price1 == biddingPrice || price2 == biddingPrice);


    }

}

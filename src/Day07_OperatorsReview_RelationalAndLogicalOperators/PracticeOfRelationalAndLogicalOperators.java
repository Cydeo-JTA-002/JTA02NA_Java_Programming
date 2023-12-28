package Day07_OperatorsReview_RelationalAndLogicalOperators;

public class PracticeOfRelationalAndLogicalOperators {
    public static void main(String[] args) {

        // 3<5  true
        // 5<3   false

        //  ageOfStudent=17   UpperLimitRequiredAge=17
        //  ageOfStudent<=UpperLimitRequiredAge
        //    17<=17  true

        //------Question is approaching

        //  I have square hole  and one dimension of the hole
        //is 10 cms
        // and I have square shape its one dimension 9 cms
        // the question is
        //if the shape fits to the hole or not?

        int oneDimensionOfTheHole=10;
        int oneDimensionOfTheSquare=11;
        //  the dimension of the shape should be less than or equal
        // the dimension of the hole <=
        boolean shapeFits=oneDimensionOfTheSquare<=oneDimensionOfTheHole;
        System.out.println("shapeFits = " + shapeFits);
        //--Another Example
        System.out.println("--------------------------");
        // I bought a refrigerator from market and i dont know if it fits from my door or not?
        double widthOfRefrigerator=1.3;
        double heightOfRefrigerator=6.5;
        double widthOfDoor=1.49;
        double heightOfDoor=6.5;
        // first I will compare widths and to fit
        // ref width should be less than or equal to door width
        // second I will compare heights and to fit
        // ref height should be less than or equal to door height
        boolean  widthFit=widthOfRefrigerator<=widthOfDoor;
        boolean  heightFit=heightOfRefrigerator<=heightOfDoor;
        System.out.println("widthFit = " + widthFit);
        System.out.println("heightFit = " + heightFit);

        // AND OPS
        //       condition1&&condition2    true&&true
        System.out.println(true&&true);
        System.out.println(true&&false);
        boolean refrigeratorFit=widthFit&&heightFit;
        System.out.println("refrigeratorFit = " + refrigeratorFit);

        // OR OPS
        System.out.println("--------------------");
        // for a restaurant in order to enter free
        // you must be either 3 years old or less than or equal 110 cms
        int ageOfBaby=4;
        double lengthOfBaby=111;
        int ageRequirement=3;
        double lengthRequirement=110;
        boolean ageFits= ageOfBaby<=ageRequirement;
        boolean lengthFits=lengthOfBaby<=lengthRequirement;

        // either of them (at least one of the criterias should meet) should meet
        //   true||true >>  true  true|| false >> true
        boolean  enterForFree=ageFits||lengthFits;
        System.out.println("enterForFree = " + enterForFree);


    }
}




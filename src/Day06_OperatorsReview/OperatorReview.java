package Day06_OperatorsReview;

public class OperatorReview {
    public static void main(String[] args) {
        //Arithmetic Operators

        // + - * / %

        System.out.println(10-5);
        System.out.println(10+5);
        System.out.println(10/5);
        System.out.println(10%5);

        //  13%2   2*6+1   division result is 6 remainder 1

        // 1+2+"12" 3+"12"  "312"
        System.out.println(1+2+"12");
        // 1+2+"12"+1+2   3+"12"+1+2   3+"12"--  "312"+1+2   "3121"+2  "31212"

        System.out.println(1+2+"12"+1+2);

        //  1+2+"12"+(1+2+(2*3))   1+2+"12"+(1+2+6)  1+2+"12"+9  3+"12"+9   "312"+9   "3129"
        System.out.println(1+2+"12"+(1+2+(2*3)));

        //UNARY OPERATORS

        // + - ++ --    no +++   no ---

        System.out.println(+4);
        System.out.println(-4);

        int wood=6;

        wood++;  // increase number of the woods by 1
        System.out.println(wood);
        System.out.println("wood = " + wood);


        wood--; // wood number decreases by 1

        System.out.println("wood = " + wood);

        //------

        int number=6;

        number=number+1; // number=7 from now on.
        System.out.println("number = " + number);
        //  lets increase the value of number by 4
        number=number+4;  // number=11  from now on
        System.out.println("number = " + number);

        // SHORTHAND OPERATORS
         number+=4;
        System.out.println("number = " + number);




    }
}

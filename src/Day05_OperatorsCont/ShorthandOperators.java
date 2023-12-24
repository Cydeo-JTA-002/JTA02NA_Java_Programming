package Day05_OperatorsCont;

public class ShorthandOperators {
    public static void main(String[] args) {

        int number1 = 3;

        int number2 = 4;


        // update number1 using the latest value of number1 and number2 as number1+number2

        number1 = number1 + number2;  // now number1=3+4=7
        //------------
        int x = 7;
        int y = 6;

        // x=x+y    x+=y   x=7+6 =13
        System.out.println(x += y);

        // x= x*y    x*=y  x=13*6=78

        System.out.println(x*=y);

        // x=x%y   x%=y   x=78 y=6   78%6--remainder of the operation
        System.out.println(x%=y); // x=0 y=6




    }
}

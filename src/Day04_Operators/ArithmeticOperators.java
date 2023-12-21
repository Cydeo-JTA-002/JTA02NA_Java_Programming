package Day04_Operators;

public class ArithmeticOperators {

    public static void main(String[] args) {

        System.out.println(10+3);
        System.out.println(245463-235552);
        System.out.println(23*44);
        System.out.println(66/11);

        //if we use full numbers in arithmetic ops java compiler assumes it as an integer
        //if we use floating numbers in arithmetixc ops java compiler assumes it as a double
        System.out.println(10/3);
        //10/3  integer/integer ==> 10/3 = 3
        System.out.println(10.0/3);

        int num1=23;
        int num2=45;
        System.out.println(num1*num2);
        int result=num1*num2;
        System.out.println("result = " + result);
        int num3=1; // because just for the first time we assign a number, it is called initializing
        num3=2; // assign
        System.out.println("result = " + result);
        //-------------
        // 11 mod 3 ==> 2

        // odd 1 3 5 7
        // even 2 4 6 8
        // mod 2==1  odd/even?  >>odd
        // mod 2==0  odd/even?  >>even


        System.out.println(475476475%2);  // this number is odd because %2 ==1

        //UNARY OPERATORS

        // +
        System.out.println(+5765858);
        // -
        System.out.println(-86676876);

        // ++
        int number=45;
        number++; //increase number variable by 1
        System.out.println(number);
        ++number;
        System.out.println(number);

        //--
        number--; // it decreases the variable by 1
        System.out.println(number);
        --number;
        System.out.println(number); // 45

        // ++ increase the variable by 1
        number=number+1;  //number++  //number =46
        int number2;
        number2=number+1;
        number=number-2;  // decrease 2 from number then assign the result to number again
        //number is 44
        System.out.println(number);
        //-------------------







    }

}

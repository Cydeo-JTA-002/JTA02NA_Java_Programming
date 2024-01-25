package Day18_MethodOverloading;

public class MethodsReview {
    public static void main(String[] args) {

        int num1 = 3;
        int num2=4;

       // System.out.println("sum is :" + (3+4));
        System.out.println( add(num1,num2) );

        int num3= 80;
        int num4 = 90;

        add(num3, num4);
        int num5=100;
        int num6 = 60;

        int result = add(num5,num6);

        System.out.println("sum is : " + result);


    }

//    public static void add(int myNumber1, int myNumber2){
//
//        System.out.println("sum is : "+ (myNumber1+myNumber2));
//
//    }


    public static int add(int myNumber1, int myNumber2){

        int sum = myNumber1+myNumber2;

       // System.out.println("sum is : "+ (myNumber1+myNumber2));

        return sum;

    }



}

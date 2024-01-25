package Day18_MethodOverloading;

public class MethodOverloading {
    public static void main(String[] args) {

    int num1=77;
    int num2=10;
    double num3=7.99;

//    sumInInt();
//    sumIntDouble();
        sum();
        sum(num1, num2);
        sum(5.99,5);


String str1="Cydeo";



    }

    public static void sum (){
        System.out.println("sum is : " + (5+10));
    }

    public static void sum (int number1, int number2) {
        System.out.println("sum is : " + (number1 + number2));
    }
    public static void sum (int number3, double number4){
        System.out.println("sum is : " + (number3+number4));
    }

    public static void sum (double number5, int number6){
        System.out.println("summ is : "+ ( number5+number6));
    }
}

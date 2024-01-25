package Day16_CustomMethods;

public class NoParameterReturnMethods {
    public static void main(String[] args) {

        hello();
        double leftOverArea=0;

        leftOverArea=areaOfSquare()-4*areaOfCircle();

        System.out.println("leftOverArea = " + leftOverArea);

    }

    public static void hello(){
        System.out.println("Hello");
    }


    //  area of circle
    /*
    * find the area out of four circles?

        find area of square
        find area of 1 circle
        multiply circle area by 4
        solution= squarearea-fourcirclearea
* */
      public static int areaOfSquare(){
          int edgeOfSquare=10;
          int areaOfSquare=edgeOfSquare*edgeOfSquare;

         return areaOfSquare;
      }
  public static double areaOfCircle(){
      double radius=2.5;
       double areaCircle=3.14*radius*radius;
      return  areaCircle;
  }



}

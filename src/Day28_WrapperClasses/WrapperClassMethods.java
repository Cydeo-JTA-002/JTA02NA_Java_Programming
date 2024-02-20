package Day28_WrapperClasses;

public class WrapperClassMethods {
    public static void main(String[] args) {

        String score = "75";

        String newScore = score + 10;    // 7510

        System.out.println(newScore);

        int finalScore = Integer.parseInt(score)+10;

        System.out.println(finalScore);

        // initial price was "55.99"

        double newPrice =  Double.parseDouble("55.99") +20 ;
        System.out.println(newPrice);

        int min = Integer.MIN_VALUE;
        System.out.println(min);

        double max = Double.MAX_VALUE;
        System.out.println(max);


        System.out.println("================================");

        String str = "Dav23487^%%87  id *&^71234Cyde78O";

        for (int i = 0; i < str.length() ; i++) {

           // System.out.print(str.charAt(i)+" ");

            if( ! Character.isLetterOrDigit(str.charAt(i))){
                System.out.print(str.charAt(i));
            }


        }
        System.out.println();
        for (int i = 0; i < str.length() ; i++) {


            if( Character.isLetterOrDigit(str.charAt(i))){
                continue;
            }
            System.out.print(str.charAt(i));

        }

        System.out.println();
        int num = 2147483647;
        byte max1 = Byte.MAX_VALUE;
        System.out.println(max1);
        byte num2 = 127;



    }
}

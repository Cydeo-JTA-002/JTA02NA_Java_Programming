package Day13_StringIntro;

public class StringPractice1 {
    public static void main(String[] args) {

     String str1 = "Java";  // creating with literal
     String str2 = "Java";

     String str3 = new String("Java");
        System.out.println("str3 -->" + str3);

     if (str1==str2){
         System.out.println("they are equal");
     }else{
         System.out.println("NOT EQUAL!");
     }

        if (str1==str3){
            System.out.println("they are equal");
        }else{
            System.out.println("NOT EQUAL!");
        }
     // NEVER COMPARE STRINGS USING == operator, !!!!
        // Always use egual() method


        System.out.println("*************************");


        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));
        System.out.println(str1==str3);  // NEVER Compare with this Operator when you are comparing the content


        System.out.println(str2.equals("javA"));  //str2 = Java

        System.out.println(str2.equalsIgnoreCase("jAVa"));


        // Please come back at 11:30 Am EST
        //10 minutes break


    }
}

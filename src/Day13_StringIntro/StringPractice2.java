package Day13_StringIntro;

public class StringPractice2 {
    public static void main(String[] args) {

        String str1 = "Hello-WORLD";
        String str2 = new String("Hello-Worlood");

        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str2));

        System.out.println(str1.length());
        System.out.println(str2.length());
         //  "Hello-WORLD"
        System.out.println(str1.indexOf('W'));
        System.out.println(str1.indexOf('H'));
        /// index numbers start from 0  Zero
        System.out.println(str1.indexOf('D'));

        System.out.println(str1.indexOf('x'));  // if String doesn't contain that char/string this method returns -1
        System.out.println(str1.indexOf('t'));

        System.out.println(str1.indexOf("Hello"));
        System.out.println(str1.indexOf("hello"));
        System.out.println(str1.indexOf("llo"));

//  str2 -->  "Hello-Worlood"
        System.out.println(str2.lastIndexOf('o'));   //last occurrence of that char


        System.out.println("*******************************");

        System.out.println(str2.charAt(0));
        System.out.println(str2.charAt(5));

        System.out.println(str2.charAt(6));


       String str3 = "Hello    David,    how are you?";
        // which char do you have in the last index of str3

        System.out.println(str3.length());
        System.out.println(str3.charAt(24));

        System.out.println(str3.charAt(str3.length()-1));





    }
}

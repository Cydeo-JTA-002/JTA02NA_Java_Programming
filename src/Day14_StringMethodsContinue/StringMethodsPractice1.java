package Day14_StringMethodsContinue;

public class StringMethodsPractice1 {
    public static void main(String[] args) {

        String str1 = "I Love";                              // with literals
        String str2 = new String(" Java Programming");  // with new keyword

        String str3 = str1.concat(str2);


        System.out.println(str3);

        String str4 = str1 + 55;

        System.out.println(str4);

        System.out.println("-----------------------------------");

        String myString = "  Hi, I     am        David  .";
        System.out.println(myString.length());
        System.out.println(myString);

        String myString2 = myString.trim();
        System.out.println(myString2.length());
        System.out.println(myString2);

        System.out.println("--------------------------------------");

        String stringEmpty = "";
        System.out.println(stringEmpty.length());
        System.out.println(stringEmpty);
        System.out.println(stringEmpty.isEmpty());

        String stringBlank= "          ";
        System.out.println(stringBlank.length());
        System.out.println(stringBlank);
        System.out.println(stringBlank.isBlank());





    }
}

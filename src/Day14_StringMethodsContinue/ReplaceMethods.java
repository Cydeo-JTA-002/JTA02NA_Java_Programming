package Day14_StringMethodsContinue;

public class ReplaceMethods {
    public static void main(String[] args) {

        String str1 = " I love Java Programming, java is easy, Java is very common";
        System.out.println(str1);

        String str2 = str1.replace("Java" , "Phyton");
        System.out.println(str2);

        String str3 = str1.replaceAll(" ", "*");
        System.out.println(str3);

        String str4 = str1.replaceFirst("Java", "Javascript");
        System.out.println(str4);

        System.out.println(str1);

        str1 = str1.replace("Java", "C++");
        System.out.println(str1);





    }



}

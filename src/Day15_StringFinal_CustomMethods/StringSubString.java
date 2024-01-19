package Day15_StringFinal_CustomMethods;

public class StringSubString {
    public static void main(String[] args) {

        int name_=9;

        // naming conventions
        // camelCase  we are going to use it in naming variable and method names
        // String helloWorld

        //PascalCase     HappyBirthdayToYou   we use it Classnames

        // snake case   hello_world

        //  1st option of substring()

        String sentence="I love Java Programming";
        String subString1=sentence.substring(7);
        System.out.println(subString1);
        // 2nd option of substring()

        String subString2=sentence.substring(7,11);
        System.out.println(subString2);
    }
}

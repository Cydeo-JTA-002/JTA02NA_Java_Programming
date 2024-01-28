package Day19_LoopsIntro;

public class LoopsWithString {
    public static void main(String[] args) {

        String str1 = "I love java, I love practicing";
           // last index is always 1 minus length
        System.out.println(str1.length());
        for (int i = 0; i <= str1.length()-1; i++) {
            System.out.println(str1.charAt(i));
            
        }

        System.out.println("--------------");

        // how many lower case vowels are there in my string
        // a, e, i,o,u
//   String str1 = "I love java, I love practicing";
        int vowelCounter=0;

        for (int i = 0; i <= str1.length()-1 ; i++) {


            if (str1.charAt(i)=='a' || str1.charAt(i)=='e' || str1.charAt(i)=='i' || str1.charAt(i)=='o' || str1.charAt(i)=='u') {
               vowelCounter++;
            }

        }

        System.out.println("vovelCounter = " + vowelCounter);










    }
}

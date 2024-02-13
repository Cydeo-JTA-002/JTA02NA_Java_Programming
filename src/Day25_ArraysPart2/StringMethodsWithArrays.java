package Day25_ArraysPart2;

import java.util.Arrays;

public class StringMethodsWithArrays {
    public static void main(String[] args) {

        String email = "david@jacobs@gmail@com";
//split()
        System.out.println(Arrays.toString(email.split("@")));

        //toChar Array

        System.out.println(Arrays.toString(email.toCharArray()));
        char[] arr = email.toCharArray();
    }
}

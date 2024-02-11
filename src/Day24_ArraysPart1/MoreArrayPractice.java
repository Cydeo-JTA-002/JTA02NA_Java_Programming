package Day24_ArraysPart1;

import java.util.Arrays;

public class MoreArrayPractice {
    public static void main(String[] args) {

        int[] scores = {80,90,60,75,100,100,55};

        System.out.println(scores.length);
        System.out.println(Arrays.toString(scores));

        int lastIndex = scores.length-1;
        System.out.println(lastIndex);

        System.out.println(scores[lastIndex]);
        // System.out.println(scores[75]);

        System.out.println("=====================");

        for (int i = 0; i < scores.length; i++) {
            System.out.println(scores[i]+10);
        }

        System.out.println(Arrays.toString(scores));

        for (int each   : scores  ) {
            System.out.print(each + " ");
        }

    }
}

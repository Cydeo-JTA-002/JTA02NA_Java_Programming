package Day27_ArrayList_Part2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsMethods {
    public static void main(String[] args) {


        ArrayList<Integer> myNums = new ArrayList<>(Arrays.asList(1, 8, 7, 99, 7, 1, 9));
        System.out.println(myNums);

        Collections.sort(myNums);
        System.out.println(myNums);

        Collections.reverse(myNums);
        System.out.println(myNums);

        Collections.shuffle(myNums);
        System.out.println(myNums);

        System.out.println(Collections.min(myNums));
        System.out.println(Collections.max(myNums));




    }
}

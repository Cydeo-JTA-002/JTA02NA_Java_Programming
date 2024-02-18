package Day27_ArrayList_Part2;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkMethods {
    public static void main(String[] args) {

        ArrayList<Integer> myNums = new ArrayList<>(Arrays.asList(1, 8, 7, 99, 7, 1, 9));
        myNums.add(100);
        System.out.println(myNums);


        System.out.println(myNums.containsAll(Arrays.asList(1,8,99999)));

        ArrayList<Integer> nums2 = new ArrayList<>();
        nums2.add(7);
        nums2.add(1);
        nums2.add(100);
        System.out.println(nums2);
        System.out.println(myNums.containsAll(nums2));

        // addAll()
        myNums.addAll(nums2);
        System.out.println(myNums);

        //removeAll()
        myNums.removeAll(nums2);
        System.out.println(myNums);

        // retainAll

        myNums.retainAll(Arrays.asList(8,99));
        System.out.println(myNums);


    }
}

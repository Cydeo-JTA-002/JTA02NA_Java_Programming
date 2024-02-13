package Day25_ArraysPart2;

import java.util.Arrays;

public class ArraysReview {
    public static void main(String[] args) {

        int[] nums = new int[8];
        nums[0]=-6;
        nums[1]=99;
        nums[2]=44;
        nums[3]=44;
        nums[4]=86;
        nums[5]=-89;
        nums[6]=7000;
        nums[7]=5;

        System.out.println(Arrays.toString(nums));
        System.out.println(nums[0]);
        System.out.println(nums[4]);
        System.out.println(nums[7]);
        System.out.println(nums[7]*10);
        System.out.println(nums.length);
        System.out.println("==========================");

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
        System.out.println("====================");
        int sum=0;
        for (int i = 0; i < nums.length; i++) {
            sum= sum + nums[i];
        }
        System.out.println("sum = " + sum);
        // average of the numbers in my nums array
        int average = sum/nums.length;
        System.out.println(average);

        System.out.println("=============================");

        String[] names =  {"David", "Xilola", "Almazbek", "Sena","Abdullah"};
        System.out.println(Arrays.toString(names));
        System.out.println(names[3]);
        System.out.println(names[3].toUpperCase());
        System.out.println(names.length);
        System.out.println(names[names.length-1]);
        System.out.println("============================");

        for ( String each : names ) {
            System.out.print(each.charAt(0)+" ");
            System.out.println(each);
        }
        for (int num: nums) {
            System.out.println(num);
        }

        System.out.println(Arrays.toString(nums));
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

        System.out.println(Arrays.toString(names));
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));
        int[] nums2=new int[3];
        System.out.println(Arrays.equals(nums,nums2));
    }
}

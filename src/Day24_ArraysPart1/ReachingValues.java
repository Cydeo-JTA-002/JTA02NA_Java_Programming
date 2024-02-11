package Day24_ArraysPart1;

import java.util.Arrays;

public class ReachingValues {
    public static void main(String[] args) {

        double[] arr = new double[4];

        arr[0]=3.5;
        arr[1]=4.0;
        arr[2]=5.5;
        arr[3]=1.0;
      //  arr[4]=6.0;  indexOutOfBounds exception

        System.out.println(arr); // we don't like this
        System.out.println(Arrays.toString(arr));

        System.out.println(arr[1]);

        double result = arr[1] + 5;

        System.out.println(result);

        System.out.println(arr[3]);

        System.out.println("==================");

        String[] names = new String[4];
        names[0]="cemal";
        names[1]="Xilola";
        names[2]= "Ali";
        names[3]="Almazbek";

        System.out.println(Arrays.toString(names));

        names[1].toLowerCase();

        System.out.println(names.length);

        System.out.println("================");

        short[] arr1 = new short[10];

        System.out.println(arr1.length);
        System.out.println(Arrays.toString(arr1));
        arr1[0]=7;
        arr1[1]=44;
        arr1[2]=55;
        arr1[3]=8;
        arr1[4]=9;
        arr1[5]=67;
        arr1[6]=700;
        arr1[7]=566;
        arr1[8]=77;
        arr1[9]=-89;

        System.out.println(Arrays.toString(arr1));
        System.out.println(arr1[9]);

        for (int i = 0; i < arr1.length; i++) {

            System.out.println(arr1[i]);

        }

    }
}

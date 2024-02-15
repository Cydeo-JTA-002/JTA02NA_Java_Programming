package Day26_ArrayList_Part1;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListIntro {
    public static void main(String[] args) {

        System.out.println("-----------Array--------------");

        String[] items = new String[4];
        System.out.println(Arrays.toString(items));
        items[0]="Banana";
        items[1]="Milk";
        items[2]="Eggs";
        items[3]="Water";

        System.out.println(Arrays.toString(items));

        System.out.println(items.length);



        System.out.println("-----------ArrayList--------------");

        ArrayList<String> groceryList = new ArrayList<>();
        System.out.println(groceryList);
        groceryList.add("Apple");
        groceryList.add("Water");
        groceryList.add("Orange");
        System.out.println(groceryList);
        groceryList.add("Ice");
        groceryList.add("chocolate");
        System.out.println(groceryList);

        System.out.println(groceryList.size());


        System.out.println("-----------------------------");

        ArrayList<Integer> mathScores = new ArrayList<>();
        mathScores.add(75);
        mathScores.add(90);
        mathScores.add(100);
        System.out.println(mathScores);

        System.out.println("-----------------------");

        ArrayList<Double> priceList = new ArrayList<>( Arrays.asList(3.99,2.99,0.99,10.5,6.0)  );
        System.out.println(priceList);
        System.out.println(priceList.size());
        priceList.add(5.99);
        priceList.add(0.99);
        System.out.println(priceList);
        System.out.println(priceList.size());


        for (int i = 0; i < 7; i++) {

            System.out.println(priceList.get(i));

            //System.out.println(items[i]);  this was reaching values in array
        }


    }
}

package Day27_ArrayList_Part2;

import java.util.ArrayList;

public class ArrayListMethods {
    public static void main(String[] args) {

        ArrayList<String> shoppingList = new ArrayList<>();

        // add(obj)

        shoppingList.add("Banana");
        shoppingList.add("Water");
        shoppingList.add("Apple");
        shoppingList.add("Eggs");

        System.out.println( shoppingList);

        shoppingList.add("chocolate");

        System.out.println(shoppingList);

        // add(index, obj)
        System.out.println(shoppingList.size());
        shoppingList.add(2,"Ice");
        System.out.println(shoppingList);
        System.out.println(shoppingList.size());
        shoppingList.add(5,"Ice cream");
        System.out.println(shoppingList);
        // size()

        System.out.println(shoppingList.size());

        //get(index)
        System.out.println(shoppingList.get(3));

        System.out.println(shoppingList.get(6).toUpperCase() + " cake");  // get and use the element
                            //chocolate
        // items [6]   getting the elements in Array

        // set(index, obj)  it replaces the element in that index
        // remove Apple and put grapes, for example

        shoppingList.set(3, "grapes");
        System.out.println(shoppingList);
        System.out.println(shoppingList.size());

        for (int i = 0; i < shoppingList.size(); i++) {

            System.out.println(shoppingList.get(i));

            if(shoppingList.get(i).equals("Eggs")){
                break;
            }

        }

       // remove(obj)
        shoppingList.remove("Eggs");
        System.out.println(shoppingList);
        System.out.println(shoppingList.size());
        shoppingList.remove("biscuits");  // it will run, but don't remove anything
        System.out.println(shoppingList);
        System.out.println(shoppingList.size());
        shoppingList.remove("Ice cream");
        System.out.println(shoppingList);
        System.out.println(shoppingList.size());

        shoppingList.remove("water"); // should be exact match
        System.out.println(shoppingList);
        System.out.println(shoppingList.size());

        // remove (index)  go that index and remove whatever you see
        shoppingList.remove(0);
        System.out.println(shoppingList);
        System.out.println(shoppingList.size());

        shoppingList.remove(shoppingList.size()-1);
        System.out.println(shoppingList);

        // indexOf (obj)

        shoppingList.add("Banana");
        shoppingList.add("Apple");
        shoppingList.add("Eggs");
        shoppingList.add("Apple");
        shoppingList.add("Ice");
        System.out.println(shoppingList);
        System.out.println(shoppingList.indexOf("Ice"));
        System.out.println(shoppingList.indexOf("Apple"));

        //lastIndexOf(obj)
        System.out.println(shoppingList.lastIndexOf("Apple"));
        System.out.println(shoppingList.lastIndexOf("ICe")); // it will print -1 if not an exact match

        // contains(obj)  true or false

        System.out.println(shoppingList.contains("Apple"));
        System.out.println(shoppingList.contains("APPLE")); // should be exact match

     // isEmpty()  true false

        System.out.println(shoppingList.isEmpty());

        // clear()
       // shoppingList.clear();
        System.out.println(shoppingList);
        System.out.println(shoppingList.isEmpty());






    }
}

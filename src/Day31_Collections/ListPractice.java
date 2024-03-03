package Day31_Collections;

import java.util.*;

public class ListPractice {

    public static void main(String[] args) {


        ArrayList <Integer> myList = new ArrayList<>();

        List <Integer> myList2 = new ArrayList<>();

        myList2.add(12);
        myList2.add(33);
        myList2.add(2);
        myList2.add(-5);
        myList2.add(77);
        myList2.add(100);

        System.out.println(myList2);
        System.out.println(myList2.size());

        for (int i = 0; i < myList2.size(); i++) {

            System.out.println(myList2.get(i));
        }

        List <Integer> myList3 = new LinkedList<>();

        myList3.add(33);
        myList3.add(44);
        myList3.add(77);
        System.out.println(myList3);

        List <String> myVector = new Vector<>();

        Queue <String> myQue = new ArrayDeque();


    }


}

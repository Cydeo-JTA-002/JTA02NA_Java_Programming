package Day31_Collections;

import java.util.Map;
import java.util.TreeMap;

public class MapPractice {
    public static void main(String[] args) {

        Map <String, Integer> myScores = new TreeMap<>();

        myScores.put("Cemal", 90);
        myScores.put("Sena",100);
        myScores.put("Taha",90);
        myScores.put("Ali",90);
        myScores.put("Lera",90);
        myScores.put("Sena Godek",91);

        System.out.println(myScores);

        System.out.println(myScores.size());

        System.out.println(myScores.get("Ali"));
        System.out.println(myScores.get("Sena"));

        // contains

        System.out.println(myScores.containsKey("Lera"));
        System.out.println(myScores.containsValue(100));

        System.out.println(myScores.keySet());
        System.out.println(myScores.values());









    }



}

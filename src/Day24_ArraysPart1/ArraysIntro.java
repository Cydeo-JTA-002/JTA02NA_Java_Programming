package Day24_ArraysPart1;

import java.util.Arrays;

public class ArraysIntro {
    public static void main(String[] args) {

        int num1 = 5;
        String str1 = "David";

        // I have a class, 30 students, different lectures, different scores

        int student1MathScore = 96;
        int student2MathScore = 66;
        int student3MathScore = 75;

        int[] mathScores;  // decleration of an array
        mathScores = new int[30]; // instantiating


        int[] numbers = new int[5];

        System.out.println(numbers);
        System.out.println(Arrays.toString(numbers));  // printing an array

        numbers[0] = 10;  // assign a value to a specific index

        System.out.println(Arrays.toString(numbers));

        numbers[2] = 100;

        System.out.println(Arrays.toString(numbers));

        System.out.println(numbers[0]);  // how to reach a value at an index

        numbers[0] = 5;  // reassign a value

        System.out.println(Arrays.toString(numbers));




    }
}

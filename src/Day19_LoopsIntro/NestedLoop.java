package Day19_LoopsIntro;

public class NestedLoop {
    public static void main(String[] args) {

        // we have a building, it has 5 floors, and 5 apartments at each floor

        for (int i = 1; i <=5  ; i++) {


            for (int j = 1; j <=5 ; j++) {

                System.out.println("Floor : " + i + "   Apartment : " + j);

            }

            System.out.println("-------------");


        }








    }
}

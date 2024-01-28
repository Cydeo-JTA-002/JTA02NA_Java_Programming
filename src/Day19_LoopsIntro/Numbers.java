package Day19_LoopsIntro;

public class Numbers {
    public static void main(String[] args) {

        // number from 5 to 20 , on the same line
        // 20 inclusiv
        // 5 6 7 8 9 ...... 20
        for (int i = 5; i <= 20; i++) {

            System.out.print(i + " ");

        }

        System.out.println("------------------------------");
        // numbers from 20 to 10 , don't see 10, exclusive, on the same line
       // 20 19 18 17 ....  11

        for (int i = 20; i > 10  ; i--) {

            System.out.print(i + " ");

        }

        System.out.println("----------------------");

        // numbers 10 to 100, increment by 10, 100 inclusive
         //  10 20 30 40 50 60 70 80 90 100
        for (int i = 10; i <= 100; i += 10) {
            System.out.print(i+ " ");
        }

        System.out.println("-------------------------");
        // numbers from 50 to 10, decreasing by 4

        for (int i = 50; i >= 10; i -= 4) {

            System.out.print(i  + " ");
        }

        for (int i = 105; i < 110 ; i++) {
            System.out.println("hello");

        }



    }
}

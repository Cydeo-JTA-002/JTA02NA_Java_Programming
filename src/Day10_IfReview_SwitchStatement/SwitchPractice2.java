package Day10_IfReview_SwitchStatement;

import javax.sound.midi.Soundbank;

public class SwitchPractice2 {
    public static void main(String[] args) {

        String weather = "hot";

        switch (weather) {
            case "windy":
                System.out.println("Go out anf Fly Kite");
                break;

            case "snowy":
                System.out.println("Go out and make a snowMan");
                System.out.println("You can go Ski");
                break;
            case "sunny": case "clear": case "hot":
                System.out.println("Go and swim in the sea");
                break;
            case "rainy":
                System.out.println("Stay at home and Practice Java");
                break;

            default:
                System.out.println("Always practicing Java is a good option");
                break;
        }


        System.out.println("I am out of switch block");


    }
}

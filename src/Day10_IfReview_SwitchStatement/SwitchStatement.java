package Day10_IfReview_SwitchStatement;

public class SwitchStatement {
    public static void main(String[] args) {

        //if dayNumber ==  1  it is Monday
        // dayNumber 2        it is Tuesday ....dayNumber == 6 it is

//        int dayNumber = 3;
//        String weekday = "";
//
//        if (dayNumber==1){
//            weekday="Monday";
//        }else if(dayNumber==2){
//            weekday="Tuesday";
//        }else if(dayNumber==3){
//            weekday="Wednesday";
//        }else if(dayNumber==4){
//            weekday="Thursday";
//        }else if(dayNumber==5){
//            weekday="Friday";
//        }else if(dayNumber==6){
//            weekday="Saturday";
//        }else if(dayNumber==7){
//            weekday="Sunday";
//        }
//
//        System.out.println("Today it is " + weekday);


        int dayNumber = 8;
        String weekday = "";

        switch (dayNumber) {
            case 1:
                System.out.println("Today is Monday");
                weekday = "Monday";
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;

            default:
                System.out.println("please enter a Valid week dayNumber");
                break;
        }


    }
}

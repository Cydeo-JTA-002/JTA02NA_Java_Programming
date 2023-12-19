package Tasks.Day03;

public class CarInfo {
    /*
    * Create a class called CarInfo
    * Declare the following variables
    *   year
    *   make
    *   model
    *   miles
    *   color
    *   price
    *
    * Use concatenation to print the full info of the car in the following format:
    * Year Make Model, Miles, Color, Price.
    * Example:
    * 2018 Toyota Camry, 50000 miles, Red, $19000.
    * */
    public static void main(String[] args) {
        int year=2018;
        String make="Toyota";
        String model="Camry";
        int miles=50000;
        String color="Red";
        int price=3500;

        String fullInfo= year+" "+make+" "+model+", "+miles+" miles, "+color+", $"+price;
        System.out.println(fullInfo);
    }
}

package Tasks.Day03;

public class ShippingAddress {
    /*
    * Declare a class called ShippingAddress
    * Declare the following variables
    *   name
    *   buildingNumber
    *   streetName
    *   city
    *   state
    *   zipCode
    *
    * Use concatenation to print the full address*/
    public static void main(String[] args) {
        String name="Jeff Bezos";
        int buildingNumber=11;
        String streetName = "Maple Avenue";
        String city = "Springfield";
        String state = "IL";
        int zipCode = 62704;
        
        //Use concatenation to print the full address
        String fullAddress=name+"\n"+buildingNumber+" "+streetName+"\n"+city+" "+state+"\n"+zipCode;
        System.out.println( fullAddress);

    }
}

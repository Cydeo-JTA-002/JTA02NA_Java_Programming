package Day16_CustomMethods;

public class ParameterVoidMethods {
    public static void main(String[] args) {
        printWakeUp("Jo");
        printWakeUp("Polly");
        String name="Paula";

        printWashYourFaceAndBrushYourTeeth(3,1);
    }

    public static void printWakeUp(String  name){

        String name2="Paula";

        System.out.println("wake up "+name+"!");
    }
    public static void printWashYourFaceAndBrushYourTeeth (int secondsToWashFace,int minutesToBrushTeeth ){

        System.out.println("wash your face for "+secondsToWashFace+ " seconds and brush your teeth for "+minutesToBrushTeeth+" minutes!");
    }



}

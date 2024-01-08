package Tasks.operatorsTasks;

public class CanArrive {
    public static void main(String[] args) {
        boolean hasBike=false;
        boolean hasCar=true;
        boolean canArrive= hasBike || hasCar;
        System.out.println("You can arrive" + canArrive);
    }
}

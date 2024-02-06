package Day22_ClassObject;

public class Mob {

    String name;

    String color;

    int strength;

    boolean canThrowSmth;


    public void attack(){

        System.out.println(name + " is attacking a player" );

    }

    public void kill(){
        System.out.println(name + " killed you");

    }

    public void approach(){

        System.out.println(name + " is coming, run away or fight");
    }

    public void goAway(){

        System.out.println(name + " is going away, didn't see you");

    }

}

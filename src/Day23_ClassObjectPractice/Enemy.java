package Day23_ClassObjectPractice;

public class Enemy {
    public   String name;
    public String color;
    public int strength;
    public boolean canThrowSmth;

    public boolean approach(){
        System.out.println(name + " is approaching, run away or Fight");
        return true;
    }

    public void goAway(){
        System.out.println(name + " didn't see you, goes away");

    }
    public void attack(){
        System.out.println(name + " is attacking, fight or die");
    }
    public void kill(){
        System.out.println(name + " killed the player");

    }


}

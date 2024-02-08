package Day23_ClassObjectPractice;

public class Player {
    public String name;
    public String hairColor;
    public int health;
    public double food;
    public int weapon;
    public boolean hasArmour;

    public void walk(){

        System.out.println(name + " is walking around");

    }
    public void eat(){

        System.out.println(name + " is eating something ");
        food--;
        health++;

    }
    public void fight(){
        System.out.println(name + " is fighting, health will decrease soon");


    }
    public void runAway(){
        System.out.println(name + " is running away");
    }



}

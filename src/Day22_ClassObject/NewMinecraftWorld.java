package Day22_ClassObject;

public class NewMinecraftWorld {
    public static void main(String[] args) {

        Avatar player1 = new Avatar();
        Avatar player2 = new Avatar();

        Mob monster1 = new Mob();
        Mob monster2 = new Mob();

        player1.name = "Alex";

        System.out.println(player1.name);
        System.out.println(player2.name);

        player1.health = 7;
        player2.health = 3;
        System.out.println(player1.health);
        System.out.println(player2.health);

        player1.hasArmour = true;

        System.out.println(player1.hasArmour);
        System.out.println(player2.hasArmour);

        player1.walk();

        player1.hairColor = "blonde";

        player1.walk();
        player2.walk();

        player2.name="Steve";
        player2.hairColor="black";
        player2.walk();

        player1.food=3;
         // health =7
        player1.eat();

        System.out.println(player1.food);
        System.out.println(player1.health);

        System.out.println("==================");
        monster1.name="Skeleton";
        monster1.color="white";
        monster1.strength=8;
        monster1.canThrowSmth=true;

        monster2.name="Creeper";
        monster2.color="green";
        monster2.strength=5;
        monster2.canThrowSmth=false;

        monster1.approach();

        monster2.goAway();

        monster2.attack();


    }
}

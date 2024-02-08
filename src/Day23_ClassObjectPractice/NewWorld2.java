package Day23_ClassObjectPractice;

public class NewWorld2 {
    public static void main(String[] args) {

        Player player1 = new Player();
        Player player2 = new Player();
        Player avatar3 = new Player();

        Enemy monster1 = new Enemy();
        Enemy monster2 = new Enemy();


        player1.name = "Alex";
        player1.food = 10;
        player1.health = 9;
        player1.hairColor = "blonde";
        player1.weapon = 8;
        player1.hasArmour = true;

        player2.name = "Steve";
        player2.food = 5;
        player2.health = 9;
        player2.hairColor = "Blank";
        player2.weapon = 3;
        player2.hasArmour = false;


        monster1.name = "Skeleton";
        monster1.color = "white";
        monster1.strength = 4;

        monster2.name = "creeper";
        monster2.color = "green";
        monster2.strength = 2;


        while (player2.health>0 ) {
            monster1.approach();

            monster1.attack();

            System.out.println("Fight goes on ! ");

            monster1.strength--;
            System.out.println(monster1.name + "'s strength is decreasing --> " + monster1.strength);


            player2.fight();
            player2.health--;
            System.out.println(player2.name + "'s health is decreasing --> " + player2.health);


            if (monster1.strength == 0) {
                System.out.println(player2.name + " won the fight, killed the " + monster1.name);

                break;

            }

            if (player2.health == 0) {
                System.out.println(player2.name + " failed and died :( ");

            }

            System.out.println("===========================");

        }


    }
}

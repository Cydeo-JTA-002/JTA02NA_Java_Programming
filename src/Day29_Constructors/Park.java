package Day29_Constructors;

public class Park {
    public static void main(String[] args) {

        Dog dog1 = new Dog();

        dog1.name = "Max";
        dog1.breed = "Bulldog";
        dog1.age = 5;
        dog1.color = "Black";

        System.out.println(dog1.name);
        System.out.println(dog1.breed);
        System.out.println(dog1.age);
        System.out.println(dog1.color);

        System.out.println("======================");

        Dog dog2 = new Dog("Charlie");

        System.out.println(dog2.name);
        System.out.println(dog2.age);
        System.out.println(dog2.color);
        System.out.println("===============");

        Dog dog3 = new Dog("zach",2);

        System.out.println(dog3.name);
        System.out.println(dog3.age);
        System.out.println(dog3.breed);

        System.out.println("======================");
        Dog dog4 = new Dog("Ivy","Golden", 4,"brown");

        System.out.println(dog4.name);
        System.out.println(dog4.breed);
        System.out.println(dog4.age);
        System.out.println(dog4.color);

        System.out.println("======================");

        Dog dog5 = new Dog("Mia", "terrier",3, "white");
       // System.out.println(dog5.name);

        System.out.println(dog5.toString());

        System.out.println(dog4.toString());

    }

}

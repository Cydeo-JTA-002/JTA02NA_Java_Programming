package Day29_Constructors;

public class Dog {

    public Dog() {

    }

    public Dog(String nameFromUser) {
        this.name = nameFromUser;
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

//    public Dog(String nameFromUser, String breedFromUser, int ageFromUser, String colorFromUser) {
//        this.name = nameFromUser;                          // ctrl+Alt+l
//        this.breed =breedFromUser;
//        this.age = ageFromUser;
//        this.color=colorFromUser;
//    }


    public Dog(String name, String breed, int age, String color) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }

    public String name;
    public String breed;
    public int age;
    public String color;


    public void eat() {
        System.out.println(name + " is eating smth");
    }

    public void run() {

    }

    public void play() {

    }
}

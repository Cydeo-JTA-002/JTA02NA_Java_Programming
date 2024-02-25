package Day30_OOP;

public class Forest {
    public static void main(String[] args) {

        // Encapsulation, making the fields access modifiers Private
        // Creating public setter and getter methods for those fields
        Animal dog = new Animal();

        // dog.name="Max";
        //  System.out.println(dog.name);

        // dog.age=7;
        dog.setAge(7);
        System.out.println(dog.getAge());

        dog.setType("Terrier");
        System.out.println(dog.getType());

        // Inheritance
        // child object can reach and use all the fields and methods of parent class
        // we use extends keyWord in the child class

        Bird falcon = new Bird();
        falcon.color = "black";
        System.out.println(falcon.color);

        falcon.name = "birdie";

        falcon.move();

        falcon.eat();

        // if I create eat() method in the Bird Class, it is method overriding

        falcon.eat();

        final double PI = 3.14;
      //  PI=5;  compile error


    }
}

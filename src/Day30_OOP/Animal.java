package Day30_OOP;

public class Animal {

    public String name;

    public String type;

    public int age;

    public double weight;




 public void eat(){

     System.out.println(name + " is eating some Animal food");

    }

    public void move(){

        System.out.println(name +" is moving around");


    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}

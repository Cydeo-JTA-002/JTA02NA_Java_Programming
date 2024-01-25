package Day17_CustomMethodsContinue;

public class AgeCalculation {
    public static void main(String[] args) {
        // student1  2009
        // student2   2011
        // student3    2013
     int ageOfStudent1=getAge(2009);
     int ageOfStudent2=getAge(2011);

     int student3BirthYear=2013;
        int ageOfStudent3=getAge(student3BirthYear);

        System.out.println("ageOfStudent1 = " + ageOfStudent1);
        System.out.println("ageOfStudent2 = " + ageOfStudent2);
        System.out.println("ageOfStudent3 = " + ageOfStudent3);


    }

    /*
     * Create a return method
     * that accepts birthYear as an integer and returns your age as an integer
     * give the methodname getAge()
     * */

    public static int getAge(int birthYear){
         int age=2024-birthYear;
        return age;
    }


}

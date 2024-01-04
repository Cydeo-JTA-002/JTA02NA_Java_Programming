package Day09_ElseIf_NestedIf;

public class ElseIfStatement {

    public static void main(String[] args) {

        // assume that I am hungry
        // If I eat anything I will be healthy and continue playing

         int steak=10;
         int chicken=100;
         int apple=20;
         int bread=30;

//         if (steak >0){
//             System.out.println("Eat some steak");
//         }else{
//             System.out.println("Go find smth else to eat");
//         }
//
//         if (chicken >0){
//             System.out.println("Eat some chicken");
//         }else{
//             System.out.println("Go find smth else to eat");
//         }
//
//        if (apple >0){
//            System.out.println("Eat some apple");
//        }else{
//            System.out.println("Go find smth else to eat");
//        }
//
//        if (bread >0){
//            System.out.println("Eat some bread");
//        }else{
//            System.out.println("Go find smth else to eat");
//        }
//
//
//        System.out.println("We are on the game, out of eating process");

        if (steak>0){
            System.out.println("Eat some steak");
        }else if (chicken>0){
            System.out.println("Eat some chicken");
        }else if (apple>0){
            System.out.println("Eat some apple and get energy");
        }else if(bread>0){
            System.out.println("Eat some bread");
        }else{
            System.out.println("Hey go and find some food, or you will die soon");
        }




        System.out.println("We are on the game, out of eating process");


    }
}

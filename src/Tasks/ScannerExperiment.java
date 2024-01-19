package Tasks;

import java.util.Scanner;

public class ScannerExperiment {
    public static void main(String[] args) {
        Scanner  input=new Scanner(System.in);
        System.out.println("type:");
        String newString=input.nextLine();

        newString=newString.trim();

        int indexOfFirstSpace= newString.indexOf(" ");

        if(indexOfFirstSpace!=-1   ) {
            String firstWord = newString.substring(0, indexOfFirstSpace);
            System.out.println(firstWord);
        }else{
            System.out.println(newString);
        }

    }

}

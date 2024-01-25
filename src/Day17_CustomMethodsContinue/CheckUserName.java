package Day17_CustomMethodsContinue;

public class CheckUserName {
    public static void main(String[] args) {
        // Joseph==  joSePH  true
     String inputUsername1="Joseph";
     String inputUsername2="JosephSKY";

        System.out.println(checkUsername(inputUsername1));
        System.out.println(checkUsername(inputUsername2));
    }
    /*
     * Create a new return method naming checkUsername()
     * accepting a String as an input named username and
     * returning a boolean result telling true or false
     * */

    public static boolean checkUsername(String username){
        String realUsername="JosephSky";

        boolean isUsername=username.equalsIgnoreCase(realUsername);
        return isUsername;
    }

}

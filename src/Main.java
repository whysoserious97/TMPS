import System.Users.User;
import System.ITSystem;
public class Main {
    public static void main(String[] args) {

        // First creation of the system
        ITSystem system= ITSystem.getITSystem();
        System.out.println("First system:"+system.hashCode());

        //Creating 2 users 1 internal, 1 external and 1 non-valid
        User user1=system.getNewUser("internal","Admin");
        User user2=system.getNewUser("external","Client");
        User user3=system.getNewUser("internal","Client");

        //Trying to loggin for existing ones
        System.out.println(user1.login());
        System.out.println(user1.getUserType());
        System.out.println(user2.login());
        System.out.println(user2.getUserType());

        // Because 3rd is not valid he should be null and an exception has been risen.
        try {
            System.out.println(user3.login());
            System.out.println(user3.getUserType());
        }catch (Exception e){
            System.out.println("3rd user could not login");
        }

        // 2nd time we should get the same instance of System.ITSystem
        system= ITSystem.getITSystem();
        System.out.println("Second system:"+system.hashCode());
    }
}

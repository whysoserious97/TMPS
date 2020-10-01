package System.Users.InternalUsers;

import System.Users.User;

public class SupportUser implements User {

    String userType;

    public SupportUser(String factoryType){
        userType=factoryType;
    }

    @Override
    public String getUserType() {
        return this.userType;
    }

    @Override
    public String login() {
        return "A support user has logged on";
    }
}

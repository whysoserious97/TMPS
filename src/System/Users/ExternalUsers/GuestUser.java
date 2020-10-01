package System.Users.ExternalUsers;

import System.Users.User;

public class GuestUser implements User {

    String userType;

    public GuestUser(String factoryType){
        userType=factoryType;
    }

    @Override
    public String getUserType() {
        return this.userType;
    }

    @Override
    public String login() {
        return "A guest has logged on";
    }

    @Override
    public User getClone() {
        return new GuestUser(userType);
    }
}

package System.Users.ExternalUsers;

import System.Users.User;

public class ClientUser implements User {

    String userType;

    public ClientUser(String factoryType){
        userType=factoryType;
    }

    @Override
    public String getUserType() {
        return this.userType;
    }

    @Override
    public String login() {

        return "An Client user has loged on";
    }
}

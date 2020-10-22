package System;

import System.Users.ExternalUsers.ClientUser;
import System.Users.ExternalUsers.GuestUser;
import System.Users.User;

public class ExternalUserFactory extends UserFactory {

    public User getUser(String userType, String account, String password) {

        User user = null;
        String factoryType = "External";

        if (userType.toLowerCase().equals("client")) {
            user = new ClientUser(factoryType,account,password);

        }
        else if (userType.toLowerCase().equals("guest")) {
            user = new GuestUser(factoryType,account,password);
        }
        return user;
    }

}

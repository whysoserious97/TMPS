package System;

import System.Users.ExternalUsers.ClientUser;
import System.Users.ExternalUsers.GuestUser;
import System.Users.User;

public class ExternalUserFactory extends UserFactory {

    public User getUser(String userType) {

        User user = null;
        String factoryType = "External";

        if (userType.toLowerCase().equals("client")) {
            user = new ClientUser(factoryType);

        }
        else if (userType.toLowerCase().equals("guest")) {
            user = new GuestUser(factoryType);
        }
        return user;
    }

}

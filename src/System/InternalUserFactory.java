package System;

import System.Users.InternalUsers.SupportUser;
import System.Users.InternalUsers.AdminUser;
import System.Users.User;

public class InternalUserFactory extends UserFactory {

    @Override
    public User getUser(String userType) {

        User user = null;
        String factoryType = "Internal";

        if (userType.toLowerCase().equals("admin")) {
            user = new AdminUser(factoryType,"Admin","Admin");
        } else if (userType.toLowerCase().equals("support")) {
            user = new SupportUser(factoryType,"Support","Support");
        }
        return user;
    }

}

package System;

import System.Users.InternalUsers.SupportUser;
import System.Users.InternalUsers.AdminUser;
import System.Users.User;

public class InternalUserFactory extends UserFactory {

    @Override
    public User getUser(String userType,String account, String password) {

        User user = null;
        String factoryType = "Internal";

        if (userType.toLowerCase().equals("admin")) {
            user = new AdminUser(factoryType,account,password);
        } else if (userType.toLowerCase().equals("support")) {
            user = new SupportUser(factoryType,account,password);
        }
        return user;
    }

}

package System.Users.InternalUsers;

import System.Users.User;

public class AdminUser implements User {

    String userType;

    public AdminUser(String factoryType){
        userType=factoryType;
    }

    @Override
    public String getUserType() {
        return this.userType;
    }

    @Override
    public String login(){
        return "An admin user has loged on";
    }

    @Override
    public User getClone() {
        return new AdminUser(userType);
    }
}

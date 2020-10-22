package System.Users.ExternalUsers;

import System.Users.User;

public class GuestUser implements User {

    String userType;
    String account;
    String password;
    public GuestUser(String factoryType,String account,String password){

        userType=factoryType;
        this.account=account;
        this.password=password;
    }

    @Override
    public String getUserType() {
        return this.userType;
    }


    @Override
    public String login(String account,String password) {
        if (this.account.equals(account) && this.password.equals(password)){
            return "An Guest user has loged on";
        }
        else{
            return "Log in failed";
        }
    }

    @Override
    public User getClone() {
        return new GuestUser(userType,account,password);
    }
}

package System.Users.ExternalUsers;

import System.Users.User;

public class ClientUser implements User {

    String userType;
    String account;
    String password;

    public ClientUser(String factoryType,String account,String password){
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
        return "An Client user has loged on";
        }
        else{
            return "Log in failed";
        }
    }

    @Override
    public User getClone() {
        return new ClientUser(userType,account,password);
    }
}

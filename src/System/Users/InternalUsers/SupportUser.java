package System.Users.InternalUsers;

import System.Users.User;

public class SupportUser implements User {

    String userType;
    String account;
    String password;
    public SupportUser(String factoryType,String account,String password){
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
            return "A Support user has loged on";
        }
        else{
            return "Log in failed";
        }
    }

    @Override
    public User getClone(String account,String password) {
        return new SupportUser(userType,account,password);
    }
}

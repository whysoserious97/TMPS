package System.Users.InternalUsers;

import System.Users.User;

public class AdminUser implements User {

    String userType;
    String account;
    String password;
    public AdminUser(String factoryType,String account,String password){
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
            return "An Admin user has loged on";
        }
        else{
            return "Log in failed";
        }
    }
    public void setLoginAndPassword(String account,String password){
        this.account=account;
        this.password=password;
    }
    @Override
    public User getClone() {
        return new AdminUser(userType,account,password);
    }
}

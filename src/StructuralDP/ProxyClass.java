package StructuralDP;

import BankSystem.Users.User;

public class ProxyClass implements ILogin{
    public User user;
    public ProxyClass(){

    }
    public ProxyClass(User user){
        this.user=user;
    }
    @Override
    public String login(String account, String password) {

            return user.login(account,password);
    }
}

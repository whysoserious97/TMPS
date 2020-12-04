package BankSystem.StructuralDP.proxy;

import BankSystem.Creational.Users.abstraction.User;
import BankSystem.StructuralDP.abstraction.ILogin;

public class ProxyClass implements ILogin {
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

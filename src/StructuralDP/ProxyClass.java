package StructuralDP;

import System.Users.ExternalUsers.ClientUser;
import System.Users.User;

public class ProxyClass implements ILogin {
    private User user;
    private String account;
    private String password;

    public ProxyClass(String account,String password){
        this.account=account;
        this.password=password;
    }
    public ProxyClass(User user){
        this.user=user;
        account=user.getAccount();
        password=user.getPassword();
    }


    @Override
    public void login(String account,String password) {
        if (user==null){
            user=new ClientUser("Proxy","Client","Client");
        }
        user.login(account,password);
    }
}

package StructuralDP;

import System.Users.User;

public abstract class UserDecorator implements User {
    protected User decoratedUser;

    public UserDecorator(User decoratedUser){
        this.decoratedUser = decoratedUser;
    }

    public String login(String account,String password){
        return decoratedUser.login(account,password);
    }
}

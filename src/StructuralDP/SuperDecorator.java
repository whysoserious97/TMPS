package StructuralDP;

import System.Users.User;

public class SuperDecorator extends UserDecorator {

    public SuperDecorator(User decoratedUser) {
        super(decoratedUser);
    }

    @Override
    public String getUserType() {
        return "SuperUser";
    }

    @Override
    public String login(String account, String password) {
        return decoratedUser.login(account,password);
    }

    @Override
    public User getClone(String account,String password) {
        return new SuperDecorator(decoratedUser.getClone(account,password));
    }
}

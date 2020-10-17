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
    public User getClone() {
        return new SuperDecorator(decoratedUser.getClone());
    }
}

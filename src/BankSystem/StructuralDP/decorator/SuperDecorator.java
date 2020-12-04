package BankSystem.StructuralDP.decorator;

import BankSystem.Creational.Users.abstraction.User;

public class SuperDecorator extends UserDecorator {

    public SuperDecorator(User decoratedUser) {
        super(decoratedUser);
    }

    @Override
    public String getUserType() {
        return "SuperUser";
    }




    @Override
    public User getClone(String account,String password) {
        return new SuperDecorator(decoratedUser.getClone(account,password));
    }

    @Override
    public void work() {
        System.out.println("Super-User is working on system updates");
    }

}

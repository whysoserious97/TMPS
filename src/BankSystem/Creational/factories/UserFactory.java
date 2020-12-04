package BankSystem.Creational.factories;

import BankSystem.Creational.Users.abstraction.User;

public abstract class UserFactory {

    public abstract User getUser(String userType, String account, String password);


    public static UserFactory getUserFactory(String factoryType){

        UserFactory userFactory = null;
        if (factoryType.toLowerCase().equals("internal")){

            userFactory= new InternalUserFactory();
        }
        else if(factoryType.toLowerCase().equals("external")){

            userFactory= new ExternalUserFactory();
        }

        return userFactory;
    }
}

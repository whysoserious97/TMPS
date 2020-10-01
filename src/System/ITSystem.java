package System;

import System.Users.User;

public class ITSystem {

    private static ITSystem system;



    private ITSystem(){

    }

    public static ITSystem getITSystem(){
        if (system == null){
            synchronized(ITSystem.class){
                if (system == null){
                    system = new ITSystem();
                }
            }
        }
        return system;
    }

    public User getNewUser(String FactoryType, String UserType){
        return UserFactory.getUserFactory(FactoryType).getUser(UserType);

    }

}

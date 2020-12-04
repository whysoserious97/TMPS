package BankSystem.StructuralDP.decorator;

import BankSystem.Creational.Users.abstraction.User;
import BankSystem.Creational.system.ITSystem;

public abstract class UserDecorator implements User {
    protected User decoratedUser;
    public UserDecorator(User decoratedUser){
        this.decoratedUser = decoratedUser;
    }

    @Override
    public void saveDoc(String filename,String  content,String icon,String encoding,String extension,String fullname) {
        ITSystem.getITSystem().saveIntoSystem(filename,content,"superUser:"+this,icon,encoding,extension,fullname);
    }
    public String login(String account,String password){
        return decoratedUser.login(account,password);
    }
}

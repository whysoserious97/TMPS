package BankSystem.Users.InternalUsers;

import StructuralDP.Permision;
import BankSystem.Users.User;
import BankSystem.ITSystem;
import java.util.ArrayList;
import java.util.List;

public class AdminUser implements User {

    String userType;
    String account;
    String password;
    List<Permision> permisions = new ArrayList<>();

    public AdminUser(String factoryType,String account,String password){
        userType=factoryType;
        this.account=account;
        this.password=password;
    }

    @Override
    public String getUserType() {
        return this.userType;
    }

    @Override
    public String login(String account,String password) {
        if (this.account.equals(account) && this.password.equals(password)){
            return "An Admin user has loged on";
        }
        else{
            return "Log in failed";
        }
    }
    public void setLoginAndPassword(String account,String password){
        this.account=account;
        this.password=password;
    }
    @Override
    public User getClone(String account,String password) {
        return new AdminUser(userType,account,password);
    }

    @Override
    public void saveDoc(String filename,String  content,String icon,String encoding,String extension,String fullname) {
        ITSystem.getITSystem().saveIntoSystem(filename,content,"superUser:"+this,icon,encoding,extension,fullname);
    }
}

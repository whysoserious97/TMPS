package BankSystem.Creational.Users.InternalUsers;


import BankSystem.Creational.Users.abstraction.User;
import BankSystem.Creational.system.ITSystem;



public class SupportUser implements User {

    String userType;
    String account;
    String password;

    public SupportUser(String factoryType,String account,String password){
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
            return "A Support user has loged on";
        }
        else{
            return "Log in failed";
        }
    }

    @Override
    public User getClone(String account,String password) {
        return new SupportUser(userType,account,password);
    }

    @Override
    public void saveDoc(String filename,String  content,String icon,String encoding,String extension,String fullname) {
        ITSystem.getITSystem().saveIntoSystem(filename,content,this.account,icon,encoding,extension,fullname);
    }

    @Override
    public void work() {
        System.out.println("Support help the clients right now");
    }
}

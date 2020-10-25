package BankSystem.Users;

public interface User {
     String getUserType();
     String login(String account,String password);
     User getClone(String account,String password);
     void saveDoc(String filename,String  content,String icon,String encoding,String extension,String fullname);
}

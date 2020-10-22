package System.Users;

public interface User {
     String getUserType();
     String login(String account,String password);
     User getClone();
}

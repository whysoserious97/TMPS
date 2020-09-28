public class ExternalUserFactory extends UserFactory {
    public User getUser(String userType){
        User user = null;
        if (userType.toLowerCase().equals("client")){
            user= new ClientUser();
        }
        else if (userType.toLowerCase().equals("guest")){
            user= new GuestUser();
        }
        return user;
    }
}

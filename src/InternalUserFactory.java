public class InternalUserFactory extends UserFactory{
    @Override
    public User getUser(String userType){
        User user = null;
        if (userType.toLowerCase().equals("admin")){
            user= new AdminUser();
        }
        else if (userType.toLowerCase().equals("support")){
            user= new SupportUser();
        }
        return user;
    }
}

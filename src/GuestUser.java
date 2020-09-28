public class GuestUser implements User {
    @Override
    public String login() {
        return "A guest has logged on";
    }
}

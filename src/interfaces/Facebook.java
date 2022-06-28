package interfaces;

public class Facebook implements OnAuthentication{
    @Override
    public void login() {
        System.out.println("Facebook: login");
    }

    @Override
    public void logout() {
        System.out.println("Facebook: logout");
    }
}

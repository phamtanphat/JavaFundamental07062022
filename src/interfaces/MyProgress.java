package interfaces;

public class MyProgress {

    public void handler(OnAuthentication onAuthentication) {
        onAuthentication.login();
        onAuthentication.logout();
    }
}

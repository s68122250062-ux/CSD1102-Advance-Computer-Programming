public class Login {

    protected String username;
    protected String password;

    public Login(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public boolean loginStatus() {
        return username != null && password != null;
    }
}

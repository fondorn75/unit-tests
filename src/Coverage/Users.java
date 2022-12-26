package Coverage;

public class Users {

    String login;
    String password;
    public Users(String login, String password){
        this.login = login;
        this.password = password;
    }

    public boolean authorisation(String loginUser, String passwordUser){
        if (login.equals(loginUser) && password.equals(passwordUser)){
            return true;
        } else {
            return false;
        }
    }

}

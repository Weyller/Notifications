package ca.qc.lbpsb.fusion.notifications.Model;

/**
 * Created by w.desir on 11/30/2017.
 */

public class User {

    String email;
    String password;
    UserType type;

    public User() {
    }

    public User(String email, String password, UserType type) {
        this.email = email;
        this.password = password;
        this.type = type;
    }
}

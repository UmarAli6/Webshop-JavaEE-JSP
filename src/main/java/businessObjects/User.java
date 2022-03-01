package businessObjects;

import repository.UserDB;

import java.util.Collection;
/**
 * An representation of the user.
 *
 * @author Umar A & Rabi S
 */
public class User {
    private int uId;
    private String username;
    private String password;

    static public Collection validateUser(String username, String password) {
        return UserDB.validateUsers(username, password);
    }

    static public boolean addToCart(int uId, int pId){
        return UserDB.addToCart(uId, pId);
    }

    public User(int uId, String username, String password) {
        this.uId = uId;
        this.username = username;
        this.password = password;
    }

    public int getuId() {
        return uId;
    }

    public void setuId(int uId) {
        this.uId = uId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "uId=" + uId +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}

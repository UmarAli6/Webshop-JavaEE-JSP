package userInterface;

public class UserInfo {
    private int uId;
    private String username;
    private String password;
    /**
     * Class representing user to be used in the presentation layer.
     *
     * @author Umar A & Rabi S
     */
    public UserInfo(int uId, String username, String password) {
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

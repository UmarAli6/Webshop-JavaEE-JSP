package businessObjects;

import userInterface.UserInfo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
/**
 * Implements methods for accessing the database user table.
 *
 * @author Umar A & Rabi S
 */
public class UserHandler {
    public static Collection<UserInfo> validateUser(String username, String password) {
        Collection c = User.validateUser(username, password);
        List<UserInfo> users = new ArrayList<>();
        for (Iterator it = c.iterator(); it.hasNext(); ) {
            User u = (User) it.next();
            users.add(new UserInfo(u.getuId(), u.getUsername(), u.getPassword()));
        }
        return users;
    }

    public static boolean addToCart(int uId, int pId){
        return User.addToCart(uId, pId);
    }
}

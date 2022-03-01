import businessObjects.ProductHandler;
import businessObjects.UserHandler;
import userInterface.ProductInfo;
import userInterface.UserInfo;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Servlet for handling webshop presentation as user.
 *
 * @author Umar A & Rabi S
 */

public class LoginServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        List<UserInfo> uList = (List<UserInfo>) UserHandler.validateUser(username, password);

        List<ProductInfo> pList = (List<ProductInfo>) ProductHandler.fetchInventory();
        request.setAttribute("pList", pList);

        if (!uList.isEmpty()) {
            request.setAttribute("uId", uList.get(0).getuId());
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("userHome.jsp");
            requestDispatcher.forward(request, response);
        }else {
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("guestHome.jsp");
            requestDispatcher.forward(request, response);
        }


    }
}

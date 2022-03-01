import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import businessObjects.ProductHandler;
import businessObjects.UserHandler;
import userInterface.ProductInfo;
import userInterface.UserInfo;
/**
 * Servlet for handling Cart presentation
 *
 * @author Umar A & Rabi S
 */
public class CartServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("cart", ProductHandler.fetchCart(Integer.valueOf(req.getParameter("uId"))));
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("cart.jsp");
        requestDispatcher.forward(req, resp);

    }

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        UserHandler.addToCart(Integer.valueOf(req.getParameter("uId")), Integer.valueOf(req.getParameter("pId")));

        List<ProductInfo> pList = (List<ProductInfo>) ProductHandler.fetchInventory();
        req.setAttribute("pList", pList);
        req.setAttribute("uId", Integer.valueOf(req.getParameter("uId")));

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("userHome.jsp");
        requestDispatcher.forward(req, resp);
    }
}

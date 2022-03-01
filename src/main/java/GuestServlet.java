import java.io.*;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import businessObjects.ProductHandler;
import userInterface.ProductInfo;
/**
 * Servlet for handling webshop presentation as guest
 *
 * @author Umar A & Rabi S
 */
public class GuestServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<ProductInfo> pList = (List<ProductInfo>) ProductHandler.fetchInventory();

        request.setAttribute("pList", pList);

        RequestDispatcher requestDispatcher = request.getRequestDispatcher("guestHome.jsp");
        requestDispatcher.forward(request, response);
    }
}

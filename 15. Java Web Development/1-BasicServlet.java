import java.io.IOException;
import javax.servlet.*;
import javax.servlet.http.*;

// A basic servlet that responds with "Hello, World!"
public class BasicServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        response.getWriter().println("<h1>Hello, World!</h1>");
    }
}

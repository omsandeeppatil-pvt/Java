import java.io.IOException;
import javax.servlet.*;
import javax.servlet.http.*;

public class HttpRequestResponseServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        // Reading parameters from the HTTP request
        String name = request.getParameter("name");
        String age = request.getParameter("age");

        // Setting the response
        response.setContentType("text/html");
        response.getWriter().println("<h1>Hello, " + name + "! You are " + age + " years old.</h1>");
    }
}



import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Timothy Fowler
 */
@WebServlet(urlPatterns={"/homepage"})
public class HomePage extends HttpServlet
{
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws  ServletException, IOException{
        req.getRequestDispatcher("/namex.jsp").forward(req,resp);
        resp.setContentType("text/plain");
        var pw = resp.getWriter();
        var sess = req.getSession();
            var name = sess.getAttribute("name");
            var pass = sess.getAttribute("pass");
            var rname = sess.getAttribute("realname");
        if (name == null) //if there is no name currently saved
        {
            pw.printf("Register Here: http://localhost:2020/srv/logout  Log In Here: http://localhost:2020/srv/login");
        }
        else //if there is a name currently saved
        {
            pw.printf("Welcome "+rname+". Logout: http://localhost:2020/srv/logout");
        }
    }
}

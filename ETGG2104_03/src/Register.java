

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Timothy Fowler
 */
@WebServlet(urlPatterns={"/register"})
public class Register extends HttpServlet
{
    static List names = new ArrayList();
    static List passes = new ArrayList();
    static List rnames = new ArrayList();
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException{
        resp.setContentType("text/plain");
        var pw = resp.getWriter();
        var name = req.getParameter("user");
        var pass = req.getParameter("pass");
        var realname = req.getParameter("realname");
        
        if((name == null) || (pass == null) || (realname == null))
        {
            pw.printf("Not enough information provided.");
        }
        else
        {  
            names.add(name);
            passes.add(pass);
            rnames.add(realname);
            pw.printf(realname+"'s account registered. User: "+name+" Pass: "+pass);
        }
    }
}

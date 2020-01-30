

import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
@WebServlet(urlPatterns={"/login"})
public class Login extends HttpServlet
{
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException{
        resp.setContentType("text/plain");
        var pw = resp.getWriter();
        var name = req.getParameter("user");
        var pass = req.getParameter("pass");
        
        if((name == null) || (pass == null)) //user or pass is missing
        {
            pw.printf("Not enough information provided.");
        }
        else if (!(Register.names.contains(name))) //username doesn't exist
        {
            pw.printf("That user does not exist.");
        }
        else if ((Register.passes.get(Register.names.indexOf(name))) == pass) //password wrong for username
        {
            pw.printf("The password is incorrect.");
        }
        else //user and pass are correct
        {
            var sess = req.getSession();
            var realname = Register.rnames.get(Register.names.indexOf(name));
            sess.setAttribute("name", name);
            sess.setAttribute("pass", pass);
            sess.setAttribute("realname", realname);
            pw.printf("Logged in as "+realname);
        }
    }

}

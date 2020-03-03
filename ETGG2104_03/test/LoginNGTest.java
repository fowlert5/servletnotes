/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

import org.eclipse.jetty.util.log.AbstractLogger;
import org.eclipse.jetty.util.log.Log;
import org.eclipse.jetty.util.log.StdErrLog;

/**
 *
 * @author Timothy Fowler
 */


public class LoginNGTest {
    
    @BeforeClass
    public static void startJetty() throws Exception {
    String[] args = new String[]{
        "jetty.home=../jetty",
        "STOP.PORT=2021", "STOP.KEY=AutomaticTofu"
    };
    
    public LoginNGTest() {
    }
    
    
    
    @Test
    public void testDoGet() throws Exception {
        System.out.println("doGet");
        HttpServletRequest req = null;
        HttpServletResponse resp = null;
        Login instance = new Login();
        instance.doGet(req, resp);
        fail("The test case is a prototype.");
    }
    
}


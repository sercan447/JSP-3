package com.gozluk;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



@WebServlet(urlPatterns = {"/mufettis_devlet"})
public class gorusler extends HttpServlet {
    
    
RequestDispatcher basarili=null;
RequestDispatcher basarisiz = null;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       
        UserBean user = new UserBean();
        user.setUsername(req.getParameter("un"));
        user.setPassword(req.getParameter("pw"));
        
        
        user = UserDAO.login(user);
        
        if(user.isIsValid()){
            HttpSession oturumKur = req.getSession(true);
            oturumKur.setAttribute("kullaniciIsmi", user);
            
            basarili = req.getRequestDispatcher("userLogged.jsp");
            basarili.forward(req, resp);
                //resp.sendRedirect("userLogged.jsp");
            
            
        }else {
            basarisiz = req.getRequestDispatcher("invalidLogin.jsp");
            basarisiz.forward(req, resp);
            //resp.sendRedirect("invalidLogin.jsp");
        }
       }
    
    
    
    
    
}

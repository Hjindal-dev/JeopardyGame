/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import source.beans.Player;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Login extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException{
        
     String player=request.getParameter("name");
        HttpSession  session= request.getSession();
        Player client = new Player(player,0);
        session.setAttribute("class",client);
        
        //(int)(Math.random()*(b-a+1))+b
    int daily1=(int)(Math.random()*25)+0;
    int daily2=(int)(Math.random()*25)+0;
    if ((daily1==daily2) && (daily2 !=24)){
    daily2+=1;
    }
    else{
    daily2-=1;
    }
      session.setAttribute("daily1",daily1);
      session.setAttribute("daily2",daily2);
         
         RequestDispatcher view = request.getRequestDispatcher("GameBoard.jsp");
         view.forward(request,response);}}
     
 /*request.setAttribute("type",client);*/
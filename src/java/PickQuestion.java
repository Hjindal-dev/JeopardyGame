/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import source.beans.Array;
import source.beans.Question;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class PickQuestion extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException{
        
    HttpSession session= request.getSession();
    if (request.getParameter("double")!=null&&request.getParameter("double").equals("setValue")){
    int dailyDoubleVal = Integer.parseInt(request.getParameter("number"));
    Question q = (Question) session.getAttribute("question");
    int quesValue= q.getValue()+dailyDoubleVal;
    q.setValue(quesValue);
    session.setAttribute("quesValue",quesValue);
    }
 else{
   int daily1=(int)session.getAttribute("daily1");
    int daily2=(int)session.getAttribute("daily2");
       int qnum= Integer.parseInt(request.getParameter("type"));  
       Array a =new Array();
       a.loadQuestions();
       
       Question q =a.getQuestion(qnum);
        session.setAttribute("question",q); 
        if (qnum==daily1||qnum==daily2){
         RequestDispatcher view = request.getRequestDispatcher("Header.jsp");
         view.forward(request,response);
        }
        int count;
        
        if(session.getAttribute("count")==null){
        count = 0;
        }
        else{
        count = (int)(session.getAttribute("count"));
        
        }
        count++;
        session.setAttribute("count",count);
        String buttonNum = "button"+qnum;
       session.setAttribute(buttonNum,"disabled style='background-color:lightblue'");
    }
       
      
     
         RequestDispatcher view = request.getRequestDispatcher("QuestionSelect.jsp");
         view.forward(request,response);
   
  
     
}}
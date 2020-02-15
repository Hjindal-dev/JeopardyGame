                                        /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import source.beans.Player;
import source.beans.Question;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AnswerSelect extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
        HttpSession session = request.getSession();
        if ((request.getParameter("type3") != null) && (request.getParameter("type3").equals("Skip Question"))) {

        } else {
            String name = request.getParameter("name");

            Question q = (Question) session.getAttribute("question");
            int userAnswer = Integer.parseInt(request.getParameter("type2"));
            String correctAnswer = q.getCorrectAnswer();
            Player client = (Player) session.getAttribute("class");
            String answer = q.checkMethod(userAnswer);

           
            if (answer.equals(correctAnswer)) {
                client.IncreseScore(q.getValue());

            } else {
                client.DecreaseScore(q.getValue());
            }
        }
        if ((int) (session.getAttribute("count")) == 25) {
            RequestDispatcher view = request.getRequestDispatcher("WinPage.jsp");
            view.forward(request, response);
        } else {
            RequestDispatcher view = request.getRequestDispatcher("GameBoard.jsp");
            view.forward(request, response);
        }
    }
}

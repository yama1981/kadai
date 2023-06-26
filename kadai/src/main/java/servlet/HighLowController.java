package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.HighLow;
import model.HighLowLogic;

/**
 * Servlet implementation class HighLowController
 */
@WebServlet("/HighLowController")
public class HighLowController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String path = "WEB-INF/jsp/highlow.jsp";
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HighLowController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HighLow hl = new HighLow();
		HttpSession session = request.getSession();
		session.setAttribute("hl", hl);
		RequestDispatcher rd = request.getRequestDispatcher(this.path);
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String userAns =request.getParameter("userAns");
		HttpSession session = request.getSession();
		HighLow hl = (HighLow)session.getAttribute("hl");
		HighLowLogic hll = new HighLowLogic();
		hll.execute(hl, Integer.parseInt(userAns));
		session.setAttribute("hl", hl);
		RequestDispatcher rd = request.getRequestDispatcher(this.path);
		rd.forward(request, response);
		
		doGet(request, response);
	}

}

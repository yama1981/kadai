package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import  model.SlotModel;
import model.SlotModel2;
import model.SlotModel3;
import model.SlotModel4;

/**
 * Servlet implementation class Slot
 */
@WebServlet("/Slot")
public class Slot extends HttpServlet {
	private static final long serialVersionUID = 1L;
       private SlotModel model;
       private SlotModel2 model2;
       private SlotModel3 model3;
       private SlotModel4 model4;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Slot() {
        super();
        // TODO Auto-generated constructor stub
    }
    @Override
    public void init() throws ServletException {
    	model = new SlotModel();
    	model2 = new SlotModel2();
    	model3 = new SlotModel3();
    	model4 = new SlotModel4();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    @Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String result = model.spin();
		String result2 = model2.spin();
		String result3 = model3.spin();
		String result4 = model4.spin();
		request.setAttribute("result", result);
		request.setAttribute("result2", result2);
		request.setAttribute("result3", result3);
		request.setAttribute("result4", result4);
		request.getRequestDispatcher("/WEB-INF/jsp/slot.jsp").forward(request, response);
	}
    
}

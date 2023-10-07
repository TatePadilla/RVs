/**
 * @author Tate - tlpadilla
 * CIS175 - Fall 2023
 * Sep 24, 2023
 */


package controllerRVs;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.RV;


/**
 * Servlet implementation class UpdateRV
 */
@WebServlet("/updateRV")
public class UpdateRV extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateRV() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RVHelper helper = new RVHelper();
		
		String oldType = request.getParameter("oldType");
		String type = request.getParameter("type");
		Double avgCost = Double.valueOf(request.getParameter("avgCost"));
		Double avgSize = Double.valueOf(request.getParameter("avgSize"));
		
		RV rvToUpdate = helper.searchRVByName(oldType);
		
		rvToUpdate.setType(type);
		rvToUpdate.setAvgCost(avgCost);
		rvToUpdate.setAvgSize(avgSize);
		
		helper.update(rvToUpdate);
		
		getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
	}

}

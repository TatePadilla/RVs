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
 * Servlet implementation class AddRV
 */
@WebServlet("/addRV")
public class AddRV extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AddRV() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		RV r = new RV();

		RVHelper helper = new RVHelper();

		r.setType(request.getParameter("type"));
		r.setAvgCost(Double.valueOf(request.getParameter("avgCost")));
		r.setAvgSize(Double.valueOf(request.getParameter("avgSize")));
		

		helper.persist(r);

		getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
	}

}

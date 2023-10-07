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
 * Servlet implementation class DeleteFifthWheel
 */
@WebServlet("/deleteRV")
public class DeleteRV extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public DeleteRV() {
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
		RVHelper helper = new RVHelper();

		String type = request.getParameter("type");

		RV deleteable = helper.searchRVByName(type);

		helper.delete(deleteable);

		getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
	}

}

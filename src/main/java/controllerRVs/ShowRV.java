package controllerRVs;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.RV;

/**
 * Servlet implementation class ShowFifthWheel
 */
@WebServlet("/showRV")
public class ShowRV extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ShowRV() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		RVHelper helper = new RVHelper();

		List<RV> rvList = helper.showAllRVs();

		request.setAttribute("allRVs", rvList);

		String path = "/showRV.jsp";

		getServletContext().getRequestDispatcher(path).forward(request, response);
	}

}

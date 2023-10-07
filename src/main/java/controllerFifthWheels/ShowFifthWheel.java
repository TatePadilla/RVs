package controllerFifthWheels;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.FifthWheel;

/**
 * Servlet implementation class ShowFifthWheel
 */
@WebServlet("/showFifthWheel")
public class ShowFifthWheel extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ShowFifthWheel() {
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
		FifthWheelHelper helper = new FifthWheelHelper();

		List<FifthWheel> fifthWheelList = helper.showAllFifthWheels();

		request.setAttribute("allFifthWheels", fifthWheelList);

		String path = "/showFifthWheel.jsp";

		getServletContext().getRequestDispatcher(path).forward(request, response);
	}

}

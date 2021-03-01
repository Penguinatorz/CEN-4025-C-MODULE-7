package Module_7;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class serverControl
 */

public class serverControl extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */

	//simple send and save to mysql
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		todoSystem todoList = new todoSystem();

		String list = request.getParameter("list");
		System.out.println(list);
		HttpSession session = request.getSession(true);
		try {
			todoList.addToDo(list);
			todoList.todoSave();
			response.sendRedirect("Success");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/* I tried to make things seperate but I couldnot figure out with my limited knowledge of servlet
	todoSystem todoList = new todoSystem();

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getServletPath();
		try {
			switch (action) {
			case "/new":
				addNewList(request, response);
				break;
			case "/delete":
				deleteAList(request, response);
				break;
			case "/list":
				listAll(request, response);
				break;
			}
		} catch (Exception ex) {
			throw new ServletException(ex);
		}

	}

	private void listAll(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		ArrayList<String> passingList = new ArrayList<String>();
		if (todoList.todoEmpty() == false) {
			passingList = todoList.getToDoString();
			String param = passingList.toString();
			param = param.substring(1, param.length() - 1);
			try {
				String encArray = URLEncoder.encode(param, "utf-8");
				response.sendRedirect(("list.jsp?listView=" + encArray));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

	private void deleteAList(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		int delete = Integer.parseInt(request.getParameter("id"));
		todoList.deleteToDo(delete);
	}

	private void addNewList(HttpServletRequest request, HttpServletResponse response) {

		String list = request.getParameter("list");
		System.out.println(list);
		HttpSession session = request.getSession(true);
		try {
			todoList.addToDo(list);
			todoList.todoSave();
			response.sendRedirect("Success");
		} catch (Exception e) {
			e.printStackTrace();
		}
		// TODO Auto-generated method stub

	}*/

}

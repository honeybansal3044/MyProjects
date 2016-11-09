package servlets;

import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class FirstServlet extends HttpServlet {

	private static final long serialVersionUID = -6630348714995707746L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) {
		try {

			response.setContentType("text/html");
			PrintWriter out = response.getWriter();

			String n = request.getParameter("userName");
			out.print("Welcome " + n + "\n");

			HttpSession session = request.getSession();
			session.setAttribute("uname", n);

			out.print("<a href='servlet2'>visit</a>");

			out.close();

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) {

	}

}

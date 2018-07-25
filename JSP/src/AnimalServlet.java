import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AnimalServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String food = req.getParameter("FOOD");
	HttpSession session = req.getSession();
	session.setAttribute("FOOD", food);
	resp.setContentType("text/html;charset=utf-8");
	PrintWriter out = resp.getWriter();
	
	out.println("<HTML>");
	out.println("<HTML><TITLE>성격테스트</TITLE></HEAD>");
	out.println("<BODY>");
	out.println("<h3>좋아하는 동물은</h3>");
	out.println("<form action=animal>");
	out.println("<input type=\"text\" name=\"FOOD\">");
	out.println("<input type=\"submit\" value=\"확인\">");
	out.println("</form>");
	out.println("</body>");
	out.println("</HTML>");
	}

}

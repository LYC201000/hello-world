import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ResultServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		HttpSession session = req.getSession();
		String food =(String) session.getAttribute("FOOD");
		String animal = req.getParameter("ANIMAL");
		session.invalidate();
		resp.setContentType("text/html;charset=utf-8");
		PrintWriter out = resp.getWriter();
		out.println("<HEAD><TITLE>성격테스트</TITLE></HEAD>");
		out.println("<BODY>");
		out.println("<h3>성격테스트</h3>");
		out.println("<form action=animal>");
		out.printf("당신의 %s와%s를 좋아하는 성격입니다");
		out.println("</body>");
		out.println("</HTML>");
	}
	

}

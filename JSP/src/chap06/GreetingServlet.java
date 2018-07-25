package chap06;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.GregorianCalendar;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GreetingServlet extends HttpServlet {
	private PrintWriter logFile;

	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		String filename = getInitParameter("FILE_NAME");

		try {
			logFile = new PrintWriter(new FileWriter(filename,true));
			//logFile = new PrintWriter(new FileWriter("c:\\data\\log.txt", true));
		} catch (Exception e) {
			throw new ServletException(e);
		}
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub

		String name = req.getParameter("NAME");
		String greeting = "안녕하세요." + name + "님.";
		if (logFile != null) {
			GregorianCalendar now = new GregorianCalendar();
			logFile.printf("%TF %TT - %s %n", now, now, name);
		}
		resp.setContentType("text/html; charset=UTF-8");
		PrintWriter out = resp.getWriter();
		out.println("<HTML>");
		out.println("<HEAD><TITLE>인사하기</TITLE></HEAD>");
		out.println("<BODY>");
		out.println(greeting);
		out.println("</BODY>");
		out.println("</HTML>");
	}
	@Override
	public void destroy() {

		if (logFile != null)
			logFile.close();
	}
}

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HundredServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doGet(request, response);

		int total = 0;
		for (int i = 1; i <= 100; i++)
			total += i;
		

//		PrintWriter out = response.getWriter();
//		out.println("<HTML>");
//		out.println("<HTML><TITLE>Hundred Seclet</TITLE></HEAD>");
//		out.println("<BODY>");
//		out.printf("1+2+3+...+100 = %d",total);
//		out.println("</BODY>");
//		out.println("</HTML>");
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(request, response);
	}
	

}

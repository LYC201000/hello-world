import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.connector.Request;

public class AdderServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//ssuper.doGet(req, resp);
/*		<servlet>
		<servlet-name></servlet-name>
		<jsp-file></jsp-file>
	</servlet>
	<servlet-mapping>
		<servlet-name></servlet-name>
		<url-pattern></url-pattern>
	</servlet-mapping>	*/
		String str1 = req.getParameter("NUM1");
		String str2 = req.getParameter("NUM2");
		int num1 = Integer.parseInt(str1);
		int num2 = Integer.parseInt(str2);
		int sum = num1+num2;
		resp.setContentType("text/html;charset=utf-8");
		PrintWriter out = resp.getWriter();
		out.println("<HTML>");
		out.println("<HTML><TITLE>덧셈 프로그램 - 겱돠화면</TITLE></HEAD>");
		out.println("<BODY>");
		out.printf("%d + %d = %d",num1,num2,sum);
		out.println("</BODY>");
		out.println("</HTML>");
	}
	}





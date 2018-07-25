import java.io.IOException;
import java.util.Random;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.connector.Request;

public class WinnersServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doGet(req, resp);
		int arr[] = new int[5];
		Random random = new Random();
		for(int cnt =0;cnt<arr.length;cnt++)
			arr[cnt] = random.nextInt(10000000);
		req.setAttribute("ARR", arr);
		RequestDispatcher rd = req.getRequestDispatcher("WinnersServlet.jsp");
		rd.forward(req, resp);
		
		
	}

	
}

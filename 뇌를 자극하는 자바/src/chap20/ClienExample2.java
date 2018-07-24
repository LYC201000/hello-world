package chap20;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

public class ClienExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Socket socket = null;
		try {
			socket = new Socket("192.168.0.36",9000); // 소켓 생성.
			BufferedReader reader = 
					new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			PrintWriter writer = 
					new PrintWriter(socket.getOutputStream());
			
			
			writer.println("Hello, Server~");
			writer.flush();
			String str = reader.readLine();
			System.out.println(str);
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
			
			// TODO: handle exception
		}
		finally {
			try {
				socket.close();   // 소켓을 닫는다
			}
			catch (Exception e) {
				// TODO: handle exception
			}
		}

	}

}
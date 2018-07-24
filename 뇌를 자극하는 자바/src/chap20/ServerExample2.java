package chap20;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ServerSocket serverSocket = null;
		Socket socket = null;
		try {
			
			serverSocket = new ServerSocket(9000);
			socket = serverSocket.accept();
			
			BufferedReader reader = 
					new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			PrintWriter writer = 
					new PrintWriter(socket.getOutputStream());
			String str = reader.readLine();
			System.out.println(str);
			writer.println("Hello, Client~");
			writer.flush();

		} catch (Exception e) {
			System.out.println(e.getMessage());
			// TODO: handle exception
		} finally {
			try {
				// 소켓닫기
				socket.close();
			} catch (Exception ignored) {
				// TODO: handle exception
			}
			try {
				// 서버소켓닫기
				serverSocket.close();
			} catch (Exception ignored) {
				// TODO: handle exception
			}
		}

	}

}
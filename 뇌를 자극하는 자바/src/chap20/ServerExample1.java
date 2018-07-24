package chap20;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ServerSocket serverSocket = null;
		Socket socket = null;
		try {

			// 소켓생성
			serverSocket = new ServerSocket(9000);
			// 연결요청이오면 소켓생성
			socket = serverSocket.accept();
			InputStream in = socket.getInputStream();
			OutputStream out = socket.getOutputStream();
			// 수신된 데이터를 출력
			byte arr[] = new byte[100];
			in.read(arr);
			System.out.println(new String(arr));
			// 데이터를 송신
			String str = "Hello, Client";
			out.write(str.getBytes());
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

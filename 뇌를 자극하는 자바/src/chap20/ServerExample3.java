package chap20;

import java.net.ServerSocket;
import java.net.Socket;

public class ServerExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ServerSocket serverSocket = null;
		Socket socket = null;
		try {
			
			serverSocket = new ServerSocket(9001);
			socket = serverSocket.accept();
			Thread thread1 = new SenderThread2(socket);
			Thread thread2 = new ReceiverThread2(socket);
			thread1.start();
			thread2.start();


		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				// 소켓닫기
				serverSocket.close();
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
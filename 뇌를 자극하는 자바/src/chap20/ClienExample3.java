package chap20;

import java.net.Socket;

public class ClienExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Socket socket = null;
		try {
			socket = new Socket("192.168.0.36",9001);
			Thread thread1 = new SenderThread2(socket);
			Thread thread2 = new ReceiverThread2(socket);
			thread1.start();
			thread2.start();
	}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
			// TODO: handle exception
		}

}

package chap20;

import java.net.Socket;

public class ClienExample4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length !=1) {
			System.out.println("Usage: java ClienExample4<user-name>");
			return;
		}
		try {
			Socket socket= new Socket("192.168.0.36",9002);
			Thread thread1 = new SenderThread2(socket);
			Thread thread2 = new ReceiverThread2(socket);
			thread1.start();
			thread2.start();
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
			// TODO: handle exception
		}

	}

}

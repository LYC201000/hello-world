package chap20;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ClienExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Socket socket = null;
		try {
			socket = new Socket("192.168.0.36",9000); // 소켓 생성.
			
			InputStream in= socket.getInputStream();
			OutputStream out = socket.getOutputStream(); 
			
			//데이터송신
			String str = "Hello, Server";
			out.write(str.getBytes());
			
			//수신된데이터를 출력
			byte arr[]=new byte[100];
			in.read(arr);
			System.out.println(new String(arr));
			
			
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

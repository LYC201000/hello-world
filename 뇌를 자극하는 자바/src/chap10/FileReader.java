package chap10;

import java.io.BufferedReader;

public class FileReader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//FileReader reader = null;
		BufferedReader reader = null;
		try {
			//reader = new BufferedReader(new FileReader("member.txt"));
			while(true) {
				String id = reader.readLine();
				String pass = reader.readLine();
				String mno =  reader.readLine();
			
				
				if(mno==null)break;
				System.out.println(id);
				System.out.println(pass);
				System.out.println(mno);
			}
					
		}catch (Exception e) {
			// TODO: handle exception
		}
	
	}

}

package chap10;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriterExample1 {

	public static void main(String[] args) {
		BufferedWriter writer = null;
		
		//FileWriter writer = null;
		try {
			writer = new BufferedWriter(new FileWriter("output.txt"));
			char arr[] = { '뇌', '를', '자', ' ', '극', '하', '는', '자', '극', '하', '는', 'J', 'A', 'V', 'A' };
			//char arr[] = { 'ㅋ', 'ㄴ', 'ㅈ', ' ', 'ㄷ', 'ㅂ', 'ㄷ', 'ㅈ', '극', '하', '는', 'J', 'A', 'V', 'A' };
			
			for (int cnt = 0; cnt < arr.length; cnt++)
				writer.write(arr[cnt]);

		} catch (IOException ioe) {
			// TODO: handle exception
			System.out.println("파일로 출력 할수없습니다.");
		} finally {
			try {
				writer.close(); // 파일을 닫음
			} catch (Exception e) {
				// TODO: handle exception
			}

		}

	}
}

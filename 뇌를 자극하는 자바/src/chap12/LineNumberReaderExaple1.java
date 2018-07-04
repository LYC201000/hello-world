package chap12;

import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.nio.file.FileAlreadyExistsException;

public class LineNumberReaderExaple1 {

	public static void main(String[] args) {
		LineNumberReader reader = null;
		try {
			reader = new LineNumberReader(new FileReader("poem.txt"));
			
			while (true) {
				String str = reader.readLine();
				if (str == null)
					break;
				int lineNo = reader.getLineNumber();
				System.out.println(lineNo + ":" + str);
			}
		}

		catch (FileAlreadyExistsException fnfe) {
			System.out.println("파일이존재x");

		} catch (IOException ioe) {
			System.out.println("파일을 읽을 수 없습니다");
		} finally {
			System.out.println("파일을 닫습니다");
			try {
				reader.close();
			} catch (Exception e) {
				System.out.println();
			}
		}

	}

}

/*package chap10;

import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.nio.file.FileAlreadyExistsException;

import com.sun.org.apache.bcel.internal.classfile.LineNumber;

public class ReaderExample1 {

	public static void main(String[] args) {
		
		
	//	FileReader reader = null;
		//LineNumberReader reader= false;

		try {
			// TODO Auto-generated method stub
			//reader = new LineNumberReader("poem.txt");
			while (true) {
			//	int data = reader.read();
			//	if (data == -1)
					break;
			//	char ch = (char) data;
			//	System.out.println(ch);
			}
		}

		catch (FileAlreadyExistsException fnfe) {
			System.out.println("파일이존재x");

		} catch (IOException ioe) {
			System.out.println("파일을 읽을 수 없습니다");
		} finally {
			System.out.println("파일을 닫습니다");
			try {
				//reader.close();
			} catch (Exception e) {
				System.out.println();
			}
		}

	}
*/


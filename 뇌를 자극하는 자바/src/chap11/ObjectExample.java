package chap11;

import java.io.File;

import com.sun.org.apache.bcel.internal.classfile.Field;

public class ObjectExample {

	public static void main(String[] args) {
		File file = new File("C:\\뻐꾸기.txt");// 경로 찾아갈뗀 \\두번
		String str = file.toString();
		System.out.println(file);
		
	}

}

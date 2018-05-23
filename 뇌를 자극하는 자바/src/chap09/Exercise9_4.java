package chap09;

import java.util.StringTokenizer;

public class Exercise9_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringTokenizer Token = new StringTokenizer("고슴도치,앵무새|토끼",",|");
		String str1="", str2="", str3="";
		
		while(Token.hasMoreTokens()) {
			
			String str = Token.nextToken();
			System.out.println(str);
			
		}

	}

}

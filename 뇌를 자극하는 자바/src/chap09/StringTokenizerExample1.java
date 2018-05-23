package chap09;

import java.util.StringTokenizer;

public class StringTokenizerExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringTokenizer Token = new StringTokenizer("사과,배,복숭아",",?");
//		while (stok.hasMoreTokens()) {
//			String str=stok.nextToken();
//			System.out.println(str);
		String str1="", str2="", str3="",str4="";
		
		while(Token.hasMoreTokens()) {
			
			String str = Token.nextToken();
			System.out.println(str);
			
		}
		
		
//		if(Token.hasMoreTokens())			
//			str1=Token.nextToken();	
//		
//		if(Token.hasMoreTokens())
//			str2=Token.nextToken();
//		
//		if(Token.hasMoreTokens())
//			str3=Token.nextToken();
//		
//		if(Token.hasMoreTokens())
//			str4=Token.nextToken();
			
//			System.out.println("str1"+str1);
//			System.out.println("str1"+str2);
//			System.out.println("str1"+str3);
//			System.out.println("str1"+str4);

	}

}

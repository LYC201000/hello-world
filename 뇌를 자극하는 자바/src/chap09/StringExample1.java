package chap09;

public class StringExample1 {

	public static void main(String[] args) {
		String str="자바 커피";
		int len=str.length();
		for(int cnt=0;cnt<len;cnt++) {
			char ch =str.charAt(cnt);//0,1,2,3,4
			System.out.println(ch);
		}
		
		
//		String str1=new String("Hellom java");
//		String str2=new String("Hellom java");   // 생성자 같은문자도 다른값을 
//		String str3=new String("Hellom java");
//		
		String str1="Hellom java1";
		String str2="Hellom java2";// 문자가 같으면 같은값을 넣어준다
		String str3="Hellom java3";
		
		System.out.println(str1);   // 
		System.out.println(str2);
		System.out.println(str3);
		if(str1==str2)
			System.out.println("같다");
		else
			System.out.println("다르다");

	}

}

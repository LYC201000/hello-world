package chap09;

public class Exercise9_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="꽃나무는 제가 생각하는 꽃나무를"+
		"열심으로 생각하는 것처럼 열심으로 꽃을피워가지고 썻소";
		int index=str1.indexOf(" ");
		//int index=str1.lastIndexOf("a");
		
		System.out.println(str1.indexOf("꽃"));//0
		System.out.println(str1.indexOf("꽃", 3));
		System.out.println(str1.indexOf("꽃나무"));
		System.out.println(str1.indexOf("꽃나무", 3));
		System.out.println(str1.lastIndexOf('꽃'));
		System.out.println(str1.lastIndexOf('꽃', 20));
		System.out.println(str1.lastIndexOf("꽃나무"));
		System.out.println(str1.lastIndexOf("꽃나무",20));
		
		
		
		
		
		if(index<0)
			System.out.println("검색결과x");
		else
			System.out.println(index+" 인덱스에서 위치하고 있습니다");

	}

}

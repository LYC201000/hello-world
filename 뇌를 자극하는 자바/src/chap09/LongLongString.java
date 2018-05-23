package chap09;

public class LongLongString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuilder stringbuilder = new StringBuilder();
		
		for(String str : args) {
				
			stringbuilder.append(str);
			
			stringbuilder.append(" ");
		}
		System.out.println(stringbuilder);
	}

}

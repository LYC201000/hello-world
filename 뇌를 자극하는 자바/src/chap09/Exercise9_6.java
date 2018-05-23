package chap09;

import java.util.Random;

public class Exercise9_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random= new Random();
		int frontCoun=0, backcoun=0;
	
		for(int i=1;i<=10;i++) {
			int randomValue=random.nextInt(2);//2까지 나타냄
					
			if(randomValue==0) { 
				frontCoun++;
				System.out.println("앞");		
			}else {
				backcoun++;
				System.out.println("뒷면");
			}
			//System.out.println(randomValue);
		}
		System.out.println("동전앞면:"+frontCoun+"+동전뒷면"+backcoun);
	}
}

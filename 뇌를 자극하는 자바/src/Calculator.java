import java.util.Scanner;

/**
 * 2018. 5. 1. dev By lee.Y.C
   
   Calculator.java
 */

/**
 * @author Administrator
 *
 */
public class Calculator {
	// 	속성필드(데이터)
	// 	int number1=0;
	// 	int number2=0;
	// 	메소드(함수)
	public int pius(int x ,int y ,int a) 
	{
		int total= x+y+a;  //total = 100+200
		return total;
	}		
	public static void main(String[] args) {
		
		int num1,num2,num3;
		System.out.println("세개숫장비력");
		Scanner scan=new Scanner (System.in);
		num1=scan.nextInt();
		num2=scan.nextInt();
		num3=scan.nextInt();
		//객체생성			
		
		Calculator cal=new  Calculator();
		
		int result =cal.pius(num1,num2,num3);
		System.out.println("result:"+result);
	}
}

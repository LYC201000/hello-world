/**
 * 2018. 5. 2. dev By lee.Y.C
   
   Circle.java
 */

/**
 * @author Administrator
 *
 */
public class Circle {
	public int radius;
	public String name;
	
	public Circle() { // 매개변수가 없는 생성자
		radius=1;
		name= "";
	}
	//매개변수를 가진 생성자
	public Circle(int r, String n) {
		radius=r;
		name= n;
	}
	public double getarea() { //메소드
		return 3.14*radius*radius;
	}
	public static void main(String[] args) {
		Circle pizza=new Circle(10,"w자바피자");//Circle 객체 생성, 반지름 10
		double area=pizza.getarea();
		System.out.println(pizza.name+"의먼적은"+area);
		
	}

}

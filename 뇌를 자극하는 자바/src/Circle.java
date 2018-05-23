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
	// 매개변수가 없는 생성자
	public Circle() { 
		this.radius=1;
		this.name= "";
		//name= "";
	}
	//매개변수를 가진 생성자
	public Circle(int radius, String name) {
		this.radius=radius;
		name=name;
	}
	//메소드
	public double getarea() {
		return 3.14*radius*radius;
	}
	//메인메소드
	public static void main(String[] args) {
		Circle pizza=new Circle(10,"자바피자");//Circle 객체 생성, 반지름 10
		double pizza_area=pizza.getarea();
		System.out.println(pizza.name+"의먼적은"+pizza_area);	
		
		   
/*		Circle donut=new Circle();
		donut.radius =2;
		donut.name ="자바도넛";
		
		area=donut.getarea();
		System.out.println(donut.name + "의 면적은 " + area);
		System.out.println(pizza.name+"의먼적은"+area);*/
		
	}
	
	

	
}

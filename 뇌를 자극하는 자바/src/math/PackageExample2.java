package math;
import geometry.polygon.Rectangle;
//geometry.polygon.*;
public class PackageExample2 {

	public static void main(String[] args) {
		
		Rectangle rectangle=new Rectangle(2,3);
		System.out.println("넓이="+rectangle.width);
		System.out.println("높이="+rectangle.height);
		System.out.println("면적="+rectangle.getArea());
	

	}

}

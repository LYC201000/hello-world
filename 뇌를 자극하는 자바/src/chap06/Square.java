package chap06;

import com.sun.javafx.stage.WindowEventDispatcher;

public class Square extends Rectangle {
		Square(int sideLength) {
			super(sideLength, sideLength);
			
			
		
		
		// TODO Auto-generated constructor stub
	}
	int gerSideLength() {
		return(getWidth() + getHeight())*2;
	}

}

package chap06;

import javafx.scene.control.Label;

public class InterfaceExample5 {

	public static void main(String[] args) {
		chap06.Label obj = new chap06.Label("안녕하세요", 100, 30, "yellow", "green", "굴림체");
		
		printLable(obj);
		obj.resize(200,70);
		obj.setForeground("black");
		obj.setBackground("white");
		obj.setFont("궁서체");
		printLable(obj);
	}
	static void printLable(chap06.Label obj) {
		System.out.printf("%s: %d x %d 배경색(%s) 전경색(%s) 폰트(%s) %n",obj.text, obj.width, obj.height, obj.Background, obj.foreground, obj.font );
	}
}

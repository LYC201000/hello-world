package chap06;

public interface Changeable extends Resizble, Colorable{
	
	
	
	//추상메소드  는 블록이 있으면안된다
	abstract void setFont(String font);

}

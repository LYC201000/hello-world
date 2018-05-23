package chap06;

//슈퍼클래스 부모클래스
abstract class Person {
	int money;

	public Person() {
		// 기본생성자
		System.out.println("부모클래스에 기본생성자 Person()호출");
		this.money = 300000000;
	}

	public Person(int money) {
		this.money = money;
		System.out.println("부모클래스에 생성자 Person(int, money)호출");
	}

	abstract void displayHello();

	public void displayMoney() {
		// return money;
		System.out.println("재산");
	}
}

// 서브클래스 자식클래스
class Chid extends Person {
	/*
	 * (non-Javadoc)
	 * 
	 * @see chap06.Person#displayHello()
	 */
	@Override
	void displayHello() {
		// TODO Auto-generated method stub
		System.out.println("하이씨발놈아하이");

	}

	public Chid() {
		System.out.println("자식클래스에 기본생성자 Chid()호출");
		super.displayMoney();
	}

}

class UsChid extends Person {

	@Override
	void displayHello() {
		System.out.println("kikikiki");

	}

}

public class Inherit {

	public static void main(String[] args) {

		//
		// Person person=new Person(1000000000);
		// System.out.println("재산:" + person.money);

		// Chid chid = new Chid();

		Person person = new Chid();
		person.displayHello();

		person = new UsChid();
		person.displayHello();

		// chid.displayMoney();

		// System.out.println(chid.money);

	}

}

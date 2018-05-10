
public class PersonInfo {

	public static void main(String[] args) {
		
		//클래스변수
		Person obj;
		//매개변수없는 디폴트 생성자 호출하여 객체 생성
		//		person=new Person();
		//string 매개변수1개있는  생성자 호출하여 객체 생성
		//person=new Person();
		
		//string 매개변수int 매개변수있는  생성자 호출하여 객체 생성
		//person=new Person("홍길동",20);
		obj=new Person(20,"홍길동");
		

		//메소드호출
		obj.showPerson(obj);
		obj.showPerson();
		//System.out.println(obj);
	}

}

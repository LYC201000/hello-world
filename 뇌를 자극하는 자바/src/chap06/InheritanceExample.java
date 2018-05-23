package chap06;

public class InheritanceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EMailSender obj1=new EMailSender("생일축하", "고객센터", "dldudcjs1113@naver.com", "10%할인쿠폰발행됫다");
		SMSSender obj2=new SMSSender("생일축하", "고객센터", "02-000-0000", "10%할인쿠폰발행됫다");
		send(obj1, "dudcjs@dudcjs.dud");
		send(obj1, "stickman@hahaha.com");
		send(obj2, "010-0000-0000");
	}
	static void send(MessageSender obj, String recipient) {
		obj.senMessage(recipient);
	}

}

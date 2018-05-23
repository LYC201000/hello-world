package chap06;

import javax.swing.border.TitledBorder;

abstract class MessageSender {
	String title;
	protected String senderName;
	int a;

	public MessageSender(String title, String senderName) {
		// super();
		this.title = title;
		this.senderName = senderName;
	}

	abstract void senMessage(String recipoent);
}

class EMailSender extends MessageSender {
	String senderAddr;
	String emailBody;

	public EMailSender(String title, String senderName, String senderAddr, String emailBody) {
		super(title, senderName);
		this.senderAddr = senderAddr;
		this.emailBody = emailBody;
	}

	@Override
	void senMessage(String recipoent) {
		// TODO Auto-generated method stub

	}

	void sendMessage(String recipient) {
		System.out.println("--------------------------");
		System.out.println("제목:" + title);
		System.out.println("보내는 사람:" + senderName + " " + senderAddr);
		System.out.println("받는 사람:" + recipient);
		System.out.println("내용" + emailBody);

	}
}

class SMSSender extends MessageSender {
	String returnPhoneNo;
	String message;

	@Override
	void senMessage(String recipoent) {
		// TODO Auto-generated method stub

	}

	public SMSSender(String title, String senderName, String returnPhoneNo, String message) {
		super(title, senderName);
		this.returnPhoneNo = returnPhoneNo;
		this.message = message;
	}

	void SendMessage(String recipient) {
		System.out.println("---------------------");
		System.out.println("제목:" + title);
		System.out.println("보내는 사람:" + senderName);
		System.out.println("전화번호::" + recipient);
		System.out.println("회신 전화번호:" + returnPhoneNo);
		System.out.println("메세지 내용:" + message);

	}

}

public class InheritanceExample6 {

	public static void main(String[] args) {
		EMailSender obj1 = new EMailSender("생일축하", "고객센터", "dldudcjs1113@naver.com", "10%할인쿠폰발행됫다");
		SMSSender obj2 = new SMSSender("생일축하", "고객센터", "02-000-0000", "10%할인쿠폰발행됫다");
		obj1.sendMessage("dudcjs@dudcjs.dud");
		obj1.sendMessage("stickman@hahaha.com");
		obj2.SendMessage("010-0000-0000");

	}

}

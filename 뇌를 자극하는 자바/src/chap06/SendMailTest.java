package chap06;

import java.util.Date;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

//출처: http://fruitdev.tistory.com/15 [과일가게 개발자]
public class SendMailTest {

	public static void main(String[] args) {

		Properties p = System.getProperties();
		p.put("mail.smtp.starttls.enable", "true"); // gmail은 무조건 true 고정
		p.put("mail.smtp.host", "smtp.gmail.com"); // smtp 서버 주소
		p.put("mail.smtp.auth", "true"); 			// gmail은 무조건 true 고정
		p.put("mail.smtp.port", "587"); 			// gmail 포트

		Authenticator auth = new MyAuthentication();

		// session 생성 및 MimeMessage생성
		Session session = Session.getDefaultInstance(p, auth);
		MimeMessage msg = new MimeMessage(session);

		try {
			// 편지보낸시간
			msg.setSentDate(new Date());

			InternetAddress from = new InternetAddress();

			from = new InternetAddress("aa<dldudcjs1113@gmail.com>");

			// 이메일 발신자
			msg.setFrom(from);

			// 이메일 수신자
			InternetAddress to = new InternetAddress("zan03375@naver.com");
			msg.setRecipient(Message.RecipientType.TO, to);

			// 이메일 제목
			msg.setSubject("야야야야야ㅑ", "UTF-8");

			// 이메일 내용
			msg.setText("Test111", "UTF-8");

			// 이메일 헤더
			msg.setHeader("content-Type", "text/html");

			// 메일보내기
			javax.mail.Transport.send(msg);

		} catch (AddressException addr_e) {
			addr_e.printStackTrace();
		} catch (MessagingException msg_e) {
			msg_e.printStackTrace();
		}
		System.out.println("메일발송함");
	}

}

class MyAuthentication extends Authenticator {

	PasswordAuthentication pa;

	public MyAuthentication() {

		String id = "dldudcjs1113@gmail.com"; // 구글 ID
		String pw = "q1w2e3r4!!"; // 구글 비밀번호

		// ID와 비밀번호를 입력한다.
		pa = new PasswordAuthentication(id, pw);

	}

	// 시스템에서 사용하는 인증정보
	public PasswordAuthentication getPasswordAuthentication() {
		return pa;
	}
}

// 출처: http://fruitdev.tistory.com/15 [과일가게 개발자]
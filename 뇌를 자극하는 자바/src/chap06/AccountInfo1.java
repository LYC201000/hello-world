package chap06;

public class AccountInfo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account obj = new Account("999-88-777777","연흥부",10);
		System.out.println("계좌번호:%s /n"+obj.accountNo);
		System.out.println("예금주번호:%s /n"+obj.ownerName);
		System.out.println("잔액:%d /n"+obj.balance);
		

	}

}

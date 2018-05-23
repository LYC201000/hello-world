package chap06;

class Account {
	static String accountNo;
	String ownerName;
	int balance;

	public Account() {
		System.out.println("Account()가 기본생성자");
	}

	public Account(String accountNo, String ownerName, int balance) {
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
		System.out.println("Account(String accountNo, String ownerName, int balance)");

	}

	public int displayBalance() {
		return balance;
	}

	void deposit(int amount) {
		balance += amount;
	}

	int withdraw(int amount) throws Exception {
		if (balance < amount)
			throw new Exception("잔액이 부족합니다");
		balance -= amount;
		return amount;
	}
}

class CheckingAccount extends Account {
	String cardNo;

	// public CheckingAccount();
	// System.out.println("CheckingAccount() 기본생성자호출");

	public CheckingAccount(String accountNo, String ownerName, int balance, String cardNo) {
		// 부모클래스의 public Account(String accountNo, String ownerName, int balance) 을 호출
		super(accountNo, ownerName, balance);
		this.cardNo = cardNo;

		System.out.println("String accountNo, String ownerName, int balance, String cardNo");
	}

	int pay(String cardNo, int amount) throws Exception {
		if (!cardNo.equals(this.cardNo))
			throw new Exception("계좌가 틀림");
		if (balance < amount)
			throw new Exception("잔액이부족");
		// return withdraw(amount);
		return withdraw(amount);

	}
}

public class InheritanceExample1 {

	public static void main(String[] args) {
		CheckingAccount obj = new CheckingAccount("111-22-3333333", "홍길동", 100000, "5555-6666-7777-8888");// 기본생성자

		// obj.accountNo = "111-22-3333333";
		// obj.ownerName = "홍길동";
		// obj.cardNo = "5555-6666-7777-8888";
		// obj.deposit(100000);//입금
		//
		try {
			int paidAnount = obj.pay("5555-6666-7777-8888", 120000);// 출금
			// String paidAmount = null;
			System.out.println("지불액:" + paidAnount);
			System.out.println("잔액:" + obj.balance);

		} catch (Exception e) {
			String msg = e.getMessage();
			System.out.println("예외메세지:" + msg);
		}

	}

}

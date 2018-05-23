package chap06;

class CreditLineAccount extends Account {
	int creditLine;


	public CreditLineAccount(String accountNo, String ownerName, int balance, int creditLine) {
		super(accountNo, ownerName, balance);
		this.creditLine = creditLine;
	}

	int withdraw(int amount) throws Exception {
		if ((super.balance + creditLine) < amount)
			throw new Exception("인출이불가능.");
		balance -= amount;
		return amount;
	}

	public int displayCreditLine() {
		return creditLine;
	}

}

public class InheritanceExample3 {
	public static void main(String[] args) {
		CreditLineAccount obj = new CreditLineAccount("000-11-111111", "홍길동", 10000, 20000000);
		try {
			int balance =obj.displayBalance();
					System.out.println("잔액:"+balance);
			int amount = obj.withdraw(50000);
			System.out.println("인출액:" + amount);

			balance = obj.balance;//obj.displayBalance();
			System.out.println("잔액:" + balance);

			int creditLine = obj.displayCreditLine();
			System.out.println("마이나스한도:" + creditLine);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}



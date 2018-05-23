package chap06;

class BonusPointAccount extends Account {
	int bonusPoint;

	public BonusPointAccount(String account, String ownerName, int balance, int bonusPoint) {
		super(account, ownerName, balance);
		this.bonusPoint = bonusPoint;
	}

	void deposit(int amount) {
		// TODO Auto-generated method stub
		balance += amount;
		bonusPoint += (int) (amount * 0.001);
	}
}

class InheritanceExample4 {

	public static void main(String[] args) {
		BonusPointAccount obj = new BonusPointAccount("333-33-333333", "김미영", 0, 0);
				obj.deposit(3200000);
		System.out.println("잔액:"+obj.balance);
		System.out.println("누적포인트:"+obj.bonusPoint);

	}

}

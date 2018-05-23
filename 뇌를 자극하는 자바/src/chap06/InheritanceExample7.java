package chap06;
class InheritanceExample7{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account obj1=new Account("111-22-333333","임꺽정",10000);
		CheckingAccount obj2=new CheckingAccount("444-4444-4444", "홍길동", 20000, "5555-6666-7777-8888");
		CreditLineAccount obj3=new CreditLineAccount("777-7777-7777", "김선달", 30000, 2000000);
		BonusPointAccount obj4=new BonusPointAccount("000-0000-0000", "김미영", 0, 0);
		printAccountInfo(obj1);
		printAccountInfo(obj2);
		printAccountInfo(obj3);
		printAccountInfo(obj4);

	}
	static void printAccountInfo(Account obj) {
		System.out.println("계좌:"+obj.accountNo);
		System.out.println("예금주이름:"+obj.ownerName);
		System.out.println("잔액:"+obj.balance);
		System.out.println();
		
	}

}

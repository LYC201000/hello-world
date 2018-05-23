package chap06;

public class TextExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lendable arr[] = { new AppCDInfo("2005-7001", "Redhat Fedora"),
				new SeparateVolume1("589ㅂ986ㅊ", "책상은 책상이다", "빅셀") };
		checkoutAll(arr, "김수진", "20060318");

	}

	static void checkoutAll(Lendable arr[], String borrower, String date) {
		for (Lendable obj : arr) {

			try {
				obj.checkOut(borrower, date);
				System.out.println("대출인:" + borrower);
				System.out.println("대출인:" + date);
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
	}

}

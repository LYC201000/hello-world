package chap06;

public class InterfaceExample2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lendable arr[] = new Lendable[3]; // 인터페이스 타입의 배열
		arr[0] = new SeparateVolume1("883ㅇ326ㅠ2", "1500", "에코");
		arr[1] = new SeparateVolume1("602.2ㄱ428ㅅ", "2500", "곰브리치");
		arr[2] = new AppCDInfo("2002-1742", "3300");
		
		checkOutAll(arr, "윤지혜", "20060315");
	}

	static void checkOutAll(Lendable arr[], String borrower, String date) {
		for (int cnt = 0; cnt < arr.length; cnt++) {
			try {
			arr[cnt].checkOut(borrower, date);
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}

package chap06;

public class InterfaceExample1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		// SeparateVolume1 obj1 = new SeparateVolume1("863?774개", "2000", "3000");
		// Lendable obj1 = new SeparateVolume1("863?774개","2000", "3000");
		// AppCDInfo obj2 = new AppCDInfo("2005-7001", "3000");
		Lendable obj = new SeparateVolume1("863?774개", "2000", "3000");

		// Lendable obj2 = new AppCDInfo("2005-7001", "3000");
		try {
		obj.checkOut("김슬차이", "20060315");
		}
		// obj2.checkOut("김째아", "20060317");
		catch (Exception e) {
			// TODO: handle exception
		
		obj.checkIn();
		System.out.println(e.getMessage());
		// obj2.checkIn();
		}

		obj = new AppCDInfo("2005-7001", "3000");
		obj.checkOut("김째아", "20060317");

		obj.checkIn();

	}

}

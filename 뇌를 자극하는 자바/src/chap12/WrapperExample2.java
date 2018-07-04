package chap12;

public class WrapperExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int total = 0;
		for(int cnt =0;cnt<args.length;cnt++) {
			Integer obj = new Integer(args[cnt]);
			total +=obj.intValue();
		}
		System.out.println(total);
		

	}

}

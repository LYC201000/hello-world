package chap12;

public class WrapperExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int total = 0;
		for(int cnt =0;cnt<args.length;cnt++)
			total +=Integer.parseInt(args[cnt]);
		System.out.println(total);

	}

}

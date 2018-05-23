package chap09;

import java.util.Random;

public class FiveNumders {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5};
		Random random=new Random();
		int index=random.nextInt(5);
		System.out.println(arr[index]);

	}

}

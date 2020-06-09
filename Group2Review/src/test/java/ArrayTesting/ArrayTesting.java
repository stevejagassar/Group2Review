package ArrayTesting;

import java.util.Arrays;

public class ArrayTesting {

	public static void main(String[] args) {
		// Declare an Array with 10,20,30. Loop it, and Print it
		
		int [] a = {10,20,30};
		System.out.println(Arrays.toString(a));
		
		for(int i= 0; i<a.length; i++)
			
			System.out.println(a[i]);

	}

}

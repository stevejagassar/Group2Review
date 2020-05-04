package JavaExamPractice;

import java.util.HashSet;
import java.util.Set;

public class Settesting {

	public static void main(String[] args) {
		// Create a Set with Milk, Meat, Fish, Egg, and print it
		
		Set <String> myset = new HashSet<>();
		myset.add("Milk");
		myset.add("Meat");
		myset.add("Fish");
		myset.add("Egg");
		
		System.out.println(myset);
	}

}

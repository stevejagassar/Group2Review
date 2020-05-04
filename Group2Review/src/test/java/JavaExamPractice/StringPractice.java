package JavaExamPractice;

import java.util.Arrays;

public class StringPractice {

	public static void main(String[] args) {
		// Declare & print a String
		
		String a = "The United States Of America";
		
		System.out.println(a);
		
		//Loop the Sting a, and Print it
		for (int i = 0; i<a.length(); i++) {
			System.out.println("Loop for String a "+a.charAt(i));
			
		}
		
		//Reverse String a with Loop
		for(int i =a.length()-1; i >=0; i--) {
			
			System.out.println("Reverse Loop for a "+a.charAt(i));
		}
		
		//Break String b into 4 pieces
				System.out.println(Arrays.toString(a.split(" ")));
		//Reverse the String "THE UNITED STATES OF AMERICA"
		StringBuffer b = new StringBuffer("THE UNITED STATES OF AMERICA");
		
		System.out.println("Reverse String b "+b.reverse());

		
	}

}

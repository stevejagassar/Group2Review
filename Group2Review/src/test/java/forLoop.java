
public class forLoop {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		countOddZeroToHundred(); 

	}
	
	
	public static void printOneToTen() {
		for(int i = 1; i < 11 ; i++) {
			System.out.println(i);
			
		}
	}
	
	public static void printOneToHundred() {
		for(int i = 1; i < 101 ; i++) {
			System.out.println(i);
		}
	}
	
	
	public static void countDownTenToOne() {
		for(int i = 10 ; i > 0 ; i--) {
			System.out.println(i);
		}
	}
	
	public static void countDownHundredToOne() {
		for(int i = 100; i > 0 ; i--) {
			System.out.println(i);
		}
	}
	
	public static void countEvenZeroToHundred() {
		for(int i = 0; i < 101 ; i = i+2) {
			System.out.println(i);
		}
	}
	
	public static void countOddZeroToHundred() {
		for(int i = 1; i < 101; i = i + 2 ) {
			System.out.println(i);
		}
	}
	

}


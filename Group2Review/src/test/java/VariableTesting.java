
public class VariableTesting {

	
	public int getSalary() {
		return 5000;
	
	}
	
	public double getDouble() {
	return 25.25;
	}
	
	public String getString () {
		return "Steve";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VariableTesting obj = new VariableTesting();
		int a = obj.getSalary();
		
		System.out.println(a);
		
		double b = obj.getDouble();
				
		System.out.println(b);
		
		String c = obj.getString();
				
		System.out.println(c);		
	}

}

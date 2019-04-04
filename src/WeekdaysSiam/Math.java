package WeekdaysSiam;

public class Math {
	
	//non static Method-void
	
	public void getaddres() {
		System.out.println("My address is....");
	}
	public void calculator(int a,int b) {
		int total=a+b;
		System.out.println(total);
	}

	//static method- Void
	public void gettime() {
		System.out.println("Current time is....");		
	}
	//non static method- Return Type
	public int calculator1(int a,int b) {
		int total = a+b;
	return total;		
	}
	//Static Method - Return Type 
		public static int calculator2(int a, int b) {
			int total = a - b;
		return total;
		}
}

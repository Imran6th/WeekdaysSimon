package WeekdaysSiam;

public class Computer {
	
	int year;
	String Model;
	String display="15 inch";
	static String keys="36 keys";
	
	public Computer() {	
	}
	public Computer(int year) {
		this.year=year;
		System.out.println(year);
	}
	public Computer(String Model) {
		this.Model=Model;
		System.out.println(Model);
	}
	
}

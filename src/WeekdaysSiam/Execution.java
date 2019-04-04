package WeekdaysSiam;

public class Execution {

	public static void main(String[] args) {
		//Computer 
		//Object Creation Of A Class
		Computer refvar1= new Computer();
		
		//Class Name + reference variable = new + Constructor Name 
		refvar1.Model="Asus";
		System.out.println(refvar1.Model);
		Computer refvar2 = new Computer(2019);
		Computer refvar3 = new Computer("windows");
		System.out.println("its the one"+refvar3.Model);
		System.out.println(Computer.keys);
		
		//Math
		Math math=new Math();
        int newValue= Math.calculator2(7,8);
        int newValue1= Math.calculator2(7,98);
        System.out.println(newValue);
        
    int newValue2=Math.calculator2(10, 5);
    System.out.println(newValue2);
		
	}

}

public class Motor{
		static {
		System.out.println("Static Block");
		int inputVoltage=240;
		int frequency=50;
		int ratedPower=60;
		float ratedTorque=0.4f;
		motorType="AC motor";
		
		
		}
	
	 //static variables 
	static String motorNumber;
	static String motorType;
	static double voltage;
	static double current;
	static double motorSpeed;
	
	// nonstatic variables 
	boolean isMotorFunctional;
	boolean isMotorRunning;
	String color;
	int price;
	String manufacture;

	
	public Motor(boolean isMotorFunctional, boolean isMotorRunning, String color,int price,String manufacture){
		System.out.println("Printing nonStatic variables");
		this.isMotorFunctional=isMotorFunctional;
		this.isMotorRunning=isMotorRunning;
		this.color=color;
		this.price=price;
		this.manufacture=manufacture;
		
	}
	public static void main(String[] args){
		Motor motor= new Motor(true, false,"Red", 15000, "ABC motors");
		System.out.println(motor.isMotorFunctional);
		System.out.println(motor.isMotorRunning);
		System.out.println(motor.color);
		System.out.println(motor.price);
		System.out.println(motor.manufacture);

		
	
		
	}
	
}




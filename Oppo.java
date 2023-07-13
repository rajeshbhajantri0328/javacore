public class Oppo{
	String model;
	String processor;
	int price;
	int noOfSpeakers;
	networkType network1 = networkType.TWO;
	color col = color.GRAY;
	
	
	public Oppo(String model,String processor,int price,int noOfSpeakers)
	{
		this.model = model;
		this.processor = processor;
		this.price = price;
		this.noOfSpeakers = noOfSpeakers;
	}
	
	
	public static void main(String[] args){
		
		Oppo mobile = new Oppo("oppo A15s","core processor",12000,2);
		System.out.println(mobile.model);
		System.out.println(mobile.processor);
		System.out.println(mobile.price);
		System.out.println(mobile.noOfSpeakers);
		
		System.out.println(mobile.col.getValue());
		System.out.println(mobile.network1.getValue());
	
	}
		
		public String getModel(){
		return this.model;
		}
		
	
		public String getProcessor(){
		return this.processor;
		}
		
		public int getPrice(){
		return this.price;
		}
		public int getNoOfSpeakers(){
		return this.noOfSpeakers;
		}

}
enum color{
	WHITE("White"),GRAY("Gray"),BLUE("Blue");
	String value;
	
	
	color(String value){
	this.value = value;
	}
	
	public String getValue(){
	return this.value;
	}	
}

enum networkType{
	TWO(2),FOUR(4),FIVE(5);
	int value;
	
	networkType(int value){
	this.value = value;
	}
	public int getValue(){
		return this.value;
	}
}
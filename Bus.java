public class Bus{



public static void main(String[] args){
	String myName = "Rajesh";
	String myCourse = "JAVA FULL Stacks";
	String myBranch = "Electrical";
	String busName = "Marthalli";
	String college = "SGBIT";
	String bikeName = "NS ";
	String mobileName = "Oppo";
	String watchBrand = "Sonata";
	String shirtColor = "White";
	String flower = "beautiful";
	
	
	String roseColor = new String("Red");
	String trainerName = new String("Mohan");
	String laptopName = new String("HP");
	String tvName = new String("LG");
	String car = new String("Benz");
	String shoes = new String("Nike");
	String temple = new String("Hanuman");
	String city = new String("Benglore");
	String mall = new String("Orian");
	String food = new String("Dosa");
	
	int codePoint = busName.codePointCount(0,5);
	System.out.println(codePoint);
	
	boolean containedValue = flower.contains("z");
	System.out.println(containedValue);
	
	boolean contentEqual = college.contentEquals("BI");
	System.out.println(contentEqual);
	
	boolean isEnds = food.endsWith("sa");
	System.out.println(isEnds);
	
	int ignoreCase = myCourse.hashCode();
	System.out.println(ignoreCase);
	
	
}


}
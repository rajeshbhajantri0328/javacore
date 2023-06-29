public class ConstructorsType{
	public static void main (String[] args){
	   ConstructorsType def=new ConstructorsType();
	   System.out.println("Using default constructor ");
		System.out.println(def.noOfStudents);
		System.out.println(def.bloodGroup);
		System.out.println(def.myName);
		System.out.println(def.sgpa);
		System.out.println(def.age);
	    
		System.out.println("Using Parameterised constructor ");
		
		ConstructorsType par=new ConstructorsType(10,'B',"Raj",8.6f,23);
		System.out.println(par.noOfStudents);
		System.out.println(par.bloodGroup);
		System.out.println(par.myName);
		System.out.println(par.sgpa);
		System.out.println(par.age);
		
		
	}
	int noOfStudents;
	char bloodGroup;
	String myName;
	float sgpa;
	int age;
	
	public ConstructorsType(){
		
	}
	public ConstructorsType( int noOfStudents1,char bloodGroup1,String myName1,float sgpa1,int age1){
		noOfStudents=noOfStudents1;
		bloodGroup=bloodGroup1;
		myName=myName1;
		sgpa=sgpa1;
		age=age1;
		
	}
	
}
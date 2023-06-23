public class Oflineclass{
 public static void main(String args[])
 { empty();
   byte b=byteValue();
   System.out.println(b);
   int i=integerValue();
   System.out.println(i);
   float f=floatValue();
   System.out.println(f);
   long l=longValue();
   System.out.println(l);
   short sh=shortValue();
   System.out.println(sh);
  double d= doubleValue();
   System.out.println(d);
   boolean bl=booleanValue();
   System.out.println(bl);
   char c=charValue();
   System.out.println(c);
   String s=stringValue();
   System.out.println(s);
   int []ar= arrayValues();
   for(int index=0;index<ar.length;index++)
			{
				System.out.println(ar[index]);
			}
   
 }
   
	public static void empty()
	{
		int a = 10;
	    return ;
	}
	public static int integerValue()
	{
		int a=10;
		int b=20;
		int c=a+b;
	  return c;
	}	  
	public static float floatValue()
	{
		float a=7.3f;
		float b=7.6f;
		float c=a/b;
		return c;
	}
	public static byte byteValue()
	{
		byte a=100;
		byte b=80;
		byte c=(byte)(a-b);
		return c;
    }
	public static long longValue()
	{
		long a=200l;
		long b=5500l;
		long c=a*b;
		return c;
	}
	public static double doubleValue()
	{
		double a=967.67543;
		double b=1567.65897;
		double c=4567.88779;
		double avg=(a+b+c)/3;
		return avg;
	}
	public static char charValue()
	{
		char firstAlphabet='a';
		char lastAlphabet='z';
		return firstAlphabet;
    }
    public static boolean booleanValue()
	{
		int a=5 ;
		int b= 15;
		if(b<a)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static short shortValue()
	{
		short murdeshwarTicketPrice = 250;
		return murdeshwarTicketPrice;
	}
	
	
	public static String stringValue()
	{
		return "India is my country";
	}
	public static int[] arrayValues()
		{
			int [] twentyTable = {20,40,60,80,100,120,140,160,180,200};
			
			return  twentyTable;
}
}
public class NoteBook{
	final static String usedFor = "writing";
	final static int noofEdges =4;
	coverType cover = coverType.HARD;
    paperType paper = paperType.UNRULED;
    

	public static void main(String[] args) {
   NoteBook book =new NoteBook();
   System.out.println(book.cover);
   System.out.println(book.paper);


   System.out.println("*********************");
  TrafficSignals signals = new TrafficSignals();
   System.out.println(signals.colors);
   System.out.println(signals.meaning);

   System.out.println("********************");
   Alphabets alphabets = new Alphabets();
   System.out.println(alphabets.vowels);
   System.out.println(alphabets.consonants);
  	
	}
	 public enum coverType {
	 	HARD,
		SOFT,
	
	 }
	 public enum paperType{
	 	RULED,
		UNRULED
	 	
	 }
}

class TrafficSignals{
	final static int numberOfColors = 3;
    final static String greenMeans = "go";
   trafficSignalcolors colors  =trafficSignalcolors.RED ;
    colorsMeaning meaning = colorsMeaning.WAIT;



    public enum trafficSignalcolors {
    RED,YELLOW,GREEN;
    }

    public enum colorsMeaning {
    STOP,GO,WAIT;
    }
  
        
}

class Alphabets{
	final static int numberOfAlphabets=26;
	final static int numberOfVowels=5;
	 vowelsInAlphabets vowels = vowelsInAlphabets.O;
	consonantsInAlphabets consonants =consonantsInAlphabets.R;

	public enum vowelsInAlphabets{
	A,E,I,O,U;
	}
	public enum consonantsInAlphabets{
	A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S,T,U,V,W,X,Y,Z;
		
	}
}


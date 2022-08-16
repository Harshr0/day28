package generics;

public class G3 {
	public static < E > void printArray(E[] elements) {  
	    for ( E element : elements){          
	        System.out.println(element );  
	     }  
	     System.out.println();  
	}  

	public static void main(String[] args) {
		 Integer[] intArray = { 10, 20, 30, 40, 50 };  
	        Character[] charArray = { 'A', 'N', 'K', 'E', 'S','H','G','U','P','T','A' };  
	  
	        System.out.println( "Printing Integer Array" );  
	        printArray( intArray  );   
	  
	       System.out.println( "Printing Character Array" );  
	        printArray( charArray ); 
	}

}

package generics;
import java.util.*;
public class G1 {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();  
		list.add("Ankesh");  
		list.add("Gupta");  
		  
		String s=list.get(1); 
		System.out.println("element is: "+s);  
		  
		Iterator<String> itr=list.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		} 
	}

}

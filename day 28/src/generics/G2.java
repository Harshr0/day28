package generics;
import java.util.*;
public class G2 {

	public static void main(String[] args) {
		Map<Integer,String> map=new HashMap<Integer,String>();  
		map.put(1,"A");  
		map.put(4,"B");  
		map.put(2,"C");  
		  
		Set<Map.Entry<Integer,String>> set=map.entrySet();  
		  
		Iterator<Map.Entry<Integer,String>> itr=set.iterator();  
		while(itr.hasNext()){  
		Map.Entry e=itr.next();  
		System.out.println(e.getKey()+" "+e.getValue());  
		} 
	}

}

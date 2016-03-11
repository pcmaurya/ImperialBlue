import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class Test {

	
	public static int fRec(int k, int n) { 
		if (n==k) 
		return k; 
		else if (n > k) 
		return fRec(k, n - k); 
		else 
		return fRec(k - n, n); 
		}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//System.out.println(fRec(6,8));
		
		List<Integer> number = new ArrayList<>();
		
		Set<String> set = new HashSet<String>();
		
		set.add("Prakash");
		set.add("Amit");
		set.add("Prakash");
		
		System.out.println(set);
		
		Map<Integer,String> map = new HashMap<Integer, String>();
		
		
		map.put(1, "Prakash");
		map.put(2, "Amit");
		map.put(1, "Santosh");
		
		System.out.println(map);
		
		String arg1 = "Prakash";
		//String arg1 = new String("Prakash");
		String arg2 = new String("Amit");
		String arg3 = new String("Prakash");
		
		//System.out.println(arg1.equalsIgnoreCase(arg2));
		System.out.println(arg1.equalsIgnoreCase(arg3));
		
		//Collections.sort(set);
		
		
	
			

	}

}

package week3.day2;

import java.util.HashMap;
import java.util.Map;

public class MapConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String Name ="welcome to Selenium automation";
		char[] N = Name.toCharArray();
		Map<Character,Integer>empty=new HashMap<Character,Integer>();
		for (int i = 0; i < N.length; i++) {
			if(empty.containsKey(N[i])) {
		Integer Value = empty.get(N[i]);
		int newvalue=Value+1;
		empty.put(N[i], newvalue);
		
		}
			else {
				empty.put(N[i], 1);
			}
		}
	
	System.out.println(empty);
}
}
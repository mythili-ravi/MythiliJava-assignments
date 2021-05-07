
package week3.day2;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String Name ="PayPal India";
		char[] N = Name.toCharArray();
		Set<Character>charset=new HashSet<Character>();
		Set<Character>dupCharSet =new HashSet<Character>();
		for (int i = 0; i < N.length; i++) {
			if(charset.contains (N[i]))
			{
				dupCharSet.add(N[i]);
				
			}else
				{
				
				if( N[i]!=' ' );
			
			{
				charset.add(N[i]);
				
			}
		}
		
		}
		System.out.println("the charset"+charset);
		System.out.println("duplicates"+dupCharSet);
	
	}

}

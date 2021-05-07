package week3.day2;

import java.util.Arrays;

public class SortingUsingCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] company = {"HCL","Wipro","Aspire Systems","CTS"};
		int L = company.length;
	Arrays.sort(company);
	for (int i = L-1; i >=0 ; i--) {
		
	System.out.println(company[i]);
	}
		
	}

}

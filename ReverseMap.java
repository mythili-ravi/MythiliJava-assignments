package week3.day2;

import java.util.Map;
import java.util.TreeMap;

import com.google.gson.internal.LinkedTreeMap;

public class ReverseMap {

	public static void main(String[] args) {

		Map<String,Integer>Emp=new TreeMap<String,Integer>();
		Emp.put("Hari", 100);
		Emp.put("Naveen", 101);
		Emp.put("Sam", 102);
		Emp.put("Balaji", 104);
	
		{
		
System.out.println("Emp information on Reverse"+Emp);
	}
	}	}	
package workingWithMaps;

import java.util.*;

public class test 
{

	public static void main(String[] args) 
	{
		System.out.println();
		
		//-------------------------------- Hash Map----------------------
		
		HashMap<String, Integer> hMap = new HashMap<String, Integer>();
		hMap.put("Har", 21);
		hMap.put("Sid", 65);
		
		Set<String> keys = hMap.keySet();
		
		Iterator<String> itHashMap = keys.iterator();
		while(itHashMap.hasNext())
		{
			String key = itHashMap.next();
			System.out.println(key+"   ::::   "+hMap.get(key));
		}

		
		
		// ---------------------------- Hash Set --------------------------
		
		
	}

}

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

		TreeMap<Student, Float> studentTreeMap = new TreeMap<>();
		studentTreeMap.put(new Student("Harpushpam", 23, "C0732134"), 34.6f);
		
		Set<Student> treeMapKeys = studentTreeMap.keySet();
		
		Iterator<Student> itTreeMap = treeMapKeys.iterator();
		while(itTreeMap.hasNext())
		{
			Student key = itTreeMap.next();
			System.out.println(key+"    :::::    "+studentTreeMap.get(key));
		}
		// ---------------------------- Hash Set --------------------------
		
		
	}

}

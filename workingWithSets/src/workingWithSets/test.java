package workingWithSets;

import java.util.*;

public class test 
{

	public static void main(String[] args) 
	{
		
		
		/*//----------------------------- Hash Set-------------------------
		//		Randomly stored
		HashSet<String> hColors = new HashSet<>();
		
		hColors.add("Red");
		hColors.add("Red"); 		// Won't Store Duplicate Value
		hColors.add("White");
		hColors.add("Green");
		System.out.println("-------------------- Hash Set ------------------------");
		System.out.println(hColors.size());
		
		Iterator<String> itHashSet = hColors.iterator();
		
		while(itHashSet.hasNext())
			System.out.println(itHashSet.next());
		
		
		//----------------------------- Tree Set-------------------------
		//		Alphabetically sorted
				
		TreeSet<String> hTreeSet = new TreeSet<>();
				
		hTreeSet.add("Red");
		hTreeSet.add("Red"); 		// Won't Store Duplicate Value
		hTreeSet.add("White");
		hTreeSet.add("Green");
		System.out.println("-------------------- Tree Set ------------------------");
		System.out.println(hTreeSet.size());
				
		Iterator<String> itTreeSet = hTreeSet.iterator();
				
		while(itTreeSet.hasNext())
			System.out.println(itTreeSet.next());
				
		
		//----------------------------- Linked HashSet-------------------------
		//		Sorted in order of Insertion
		LinkedHashSet<String> lHashSet = new LinkedHashSet<>();
						
		lHashSet.add("Red");
		lHashSet.add("Red"); 		// Won't Store Duplicate Value
		lHashSet.add("White");
		lHashSet.add("Green");
		System.out.println("----------------- Linked Hash Set --------------------");
		System.out.println(lHashSet.size());
						
		Iterator<String> itLinkedHashSet = lHashSet.iterator();
						
		while(itLinkedHashSet.hasNext())
			System.out.println(itLinkedHashSet.next());
		*/
		
		
		
		
		
		//								Making Object Type Sets
		
		
		
		
		//----------------------------- Hash Set-------------------------
				//		Randomly stored
				HashSet<Student> hColors = new HashSet<>();
				
				hColors.add(new Student("Chandler", 34, "C070000"));		// Won't Store Duplicate Value
				hColors.add(new Student("Joey",31, "C030000"));
				hColors.add(new Student("Ross", 34, "C050000"));
				System.out.println("\n-------------------- Hash Set ------------------------");
				System.out.println(hColors.size());
				
				Iterator<Student> itHashSet = hColors.iterator();
				
				while(itHashSet.hasNext()){
					System.out.println(itHashSet.next());}
				
				
		//----------------------------- Tree Set-------------------------
				//		Alphabetically sorted
				// 		In case of Tree Set with the Object, we need to Specify in what aspect we need to Compare
						
				TreeSet<Student> hTreeSet = new TreeSet<>();
						
				hTreeSet.add(new Student("Phoebe", 32, "C07895"));
				hTreeSet.add(new Student("Monica", 31, "C056789")); 		// Won't Store Duplicate Value
				hTreeSet.add(new Student("Rachel", 29, "C078900"));
				System.out.println("\n-------------------- Tree Set ------------------------");
				System.out.println(hTreeSet.size());
						
				Iterator<Student> itTreeSet = hTreeSet.iterator();
						
				while(itTreeSet.hasNext())
					System.out.println(itTreeSet.next());
						
				
		//----------------------------- Linked HashSet-------------------------
				//		Sorted in order of Insertion
				LinkedHashSet<Student> lHashSet = new LinkedHashSet<>();
								
				lHashSet.add(new Student("Gunther", 40, "C098000"));
				lHashSet.add(new Student("Regina", 34, "C078900")); 		// Won't Store Duplicate Value
				lHashSet.add(new Student("Mike", 33, "C098000"));
				System.out.println("\n----------------- Linked Hash Set --------------------");
				System.out.println(lHashSet.size());
								
				Iterator<Student> itLinkedHashSet = lHashSet.iterator();
								
				while(itLinkedHashSet.hasNext())
					System.out.println(itLinkedHashSet.next());
				

	}

}

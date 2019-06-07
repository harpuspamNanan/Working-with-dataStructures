import java.util.*;



public class Test 
{

	public static void main(String[] args) 
	{
		Student sId[] = new Student[10];
		sId[0] = new Student("Harpushpam", 19, "C0732134");
		sId[1] = new Student("Sid", 25, "C0744044");

		
// --------------------------- Array List -----------------------------
		ArrayList<Integer> marks = new ArrayList<>();
		marks.add(100);
		marks.add(70);
		marks.add(80);
		
		Iterator<Integer> arrayListIterator = marks.iterator();		// To iterate
		System.out.println("\n-------------------- Array List ----------------------");
		while(arrayListIterator.hasNext())
		{
			System.out.println(arrayListIterator.next());
		}
		
// 	----------------------------- Vector ------------------------------
		Vector<String> talkativeStudents = new Vector<>();
		talkativeStudents.add("Harpushpam");
		talkativeStudents.add("Tirth");
		talkativeStudents.add("Sidharth");
		
		Iterator<String> vectorIterator = talkativeStudents.iterator();
		System.out.println("\n-------------------- Vector --------------------------");
		while(vectorIterator.hasNext())
		{
			System.out.println(vectorIterator.next());
		}
		
		
// ------------------------------ LinkedList --------------------------
		
		LinkedList<String> sleepingBirds = new LinkedList<>();
		sleepingBirds.add("Shaksham");
		sleepingBirds.add("Bhatia Creations");
		sleepingBirds.add("Akash");
		
		Iterator<String> linkedListIterator = sleepingBirds.iterator();
		
		System.out.println("\n-------------------- Linked List ---------------------");
		while(linkedListIterator.hasNext())
		{
			System.out.println(linkedListIterator.next());
		}
		
		
	}

}

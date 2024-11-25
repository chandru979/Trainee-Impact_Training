package collection_collections; 
import java.util.*;
public class TreeSetExample {
	public static void main(String[] args) {
//		TreeSet<String> set = new TreeSet<>(); ins()
		SortedSet<String> set = new TreeSet<>();   //adding, removing, and querying elements are O(log n) because of the Red-Black tree structure.


		
		set.add("chan");		//add  (hint use double quotes only) else error.
		set.add("sharan");
		set.add("sandhiya");
		set.add("silpa");
		set.add("sharan"); //no duplicate 

		System.out.println("TreeSet values in Sorted Order:" + set);
		
		
		System.out.println("TreeSet values in Sorted Order:" + set.first());
		System.out.println("TreeSet values in Sorted Order:" + set.last());
		System.out.println("TreeSet values in Sorted Order:" + set.remove("chan"));
		System.out.println("TreeSet values in Sorted Order:" + set.contains("chan"));


		
		
		SortedSet<String> subSet = set.subSet("sandhiya","silpa"); //only in sortedset  //subset //headSet //tailSet
//		SortedSet<String> headSet = set.headSet(15); //less tahn 15
//		SortedSet<String> tailSet = set.tailSet(15); //equal or greater than 15

		System.out.println("TreeSet values in Sorted Order:" + subSet);

		
		

		}

}

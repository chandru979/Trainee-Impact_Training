package collection_collections;

import java.util.*;
public class HashMapExample {		//For fast lookups and updates: 
									//When you don’t need to maintain order: 
									//For large datasets:

	public static void main(String[] args) {
		HashMap<Integer,String> dict = new HashMap<>();
		
		dict.put(1,"chandru");			//add value
		dict.put(2,"sharan");
		dict.put(3,"sandhiya");
		dict.put(4, "saras");
		
		System.out.println("1: " + dict.get(1));	//get value
		dict.remove(4);
		System.out.println(dict.getClass());		//typeof object
		System.out.println(dict);
		
		if(dict.containsKey(1)) {			//containsKey
			System.out.println("1 is in map");
		}
		else {
			System.out.println("Not in map");
		}
		
		if(dict.containsValue("saras")) {		//containsValue
			System.out.println("saras is in map");
		}
		else {
			System.out.println("Not in map");
		}
		
		dict.clear();		//clear map
		System.out.println(dict);
	}

}




package collection_collections;

import java.util.*;

public class CollectionExample{
	public static void main(String[] args) {
		Collection<String> emp_name = new ArrayList<>();
		emp_name.add("chandru");	//add element
		emp_name.add("sharan");
		emp_name.add("sandhiya");
		
	//Collection Interface
		
	
//		String name = "chan";
//		System.out.println(name.getClass());
		System.out.println(emp_name);				//view collection list
		System.out.println(emp_name.contains("chandru")); //check if it contains (true/false)
		System.out.println(emp_name.isEmpty()); // return (true/false)
		System.out.println(emp_name.remove("sandhiya")); //remove element
		//emp_name.clear(); //delete all
		System.out.println(emp_name);	
		System.out.println(emp_name.getClass());
		System.out.println(emp_name.contains("chandru"));
		
		
		
		
		//collections class
		
		List<Integer> integer_ex = new ArrayList<>();
		List<Number> integer_ex_1 = new ArrayList<>();


		integer_ex.add(4);
		integer_ex.add(2);
		integer_ex.add(3);
		
		System.out.println("original list" + integer_ex);	//original list
		Collections.sort(integer_ex);
		System.out.println("sorted list" + integer_ex);   	//sort
		Collections.reverse(integer_ex);
		System.out.println("reversed list" + integer_ex);	//reverse
		Integer max_value = Collections.max(integer_ex);
		System.out.println("max value in the list is " + max_value);	//max
		Integer min_value = Collections.min(integer_ex);
		System.out.println("min value in the list is " + min_value);	//min
		Collections.shuffle(integer_ex);
		System.out.println("shuffled list" + integer_ex); 
		Collections.addAll(integer_ex, 7,10);
		System.out.println("after adding list" + integer_ex); 
		Collections.addAll(integer_ex_1, 7,10,2.3,3l);
		System.out.println("after adding list using number" + integer_ex_1); 
		
		List<Integer> unmodifiable = Collections.unmodifiableList(integer_ex);
				System.out.println("unmodifiable list" + unmodifiable);			//unmodifiable
		
		//		unmodifiable.add(9);
		
		
		List<Integer> modifiable = Collections.synchronizedList(integer_ex);
		System.out.println("before synchronizedList list" + modifiable);
		
		modifiable.add(9);
		
		System.out.println("after synchronizedList list" + modifiable);

	
		Iterator<Integer> iterator = integer_ex.iterator();
	
	    while (iterator.hasNext()) {
            Integer element = iterator.next();
            System.out.println(element); // Output each element in the set
        }
		
	}
}
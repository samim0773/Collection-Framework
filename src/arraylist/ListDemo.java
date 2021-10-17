package arraylist;
import java.util.*;
public class ListDemo {
	public static void main(String[] args) {
		
		ArrayList<Integer> l1 = new ArrayList<>(20);
		
		// l2 arraylist and assign value
		ArrayList<Integer> l2 = new ArrayList<>(List.of(50,60,70,80));
		
		// *********** add element **********************
		
		// add element without index 
		l1.add(10);
		
		// add element with index 
		l1.add(0,5);
		
		// add l2 object into l1 from end point
		//l1.addAll(l2);
		
		//System.out.println("List : "+l1);
		
		// add element from index 1 and index 1 value will go last index
		l1.addAll(1, l2);
		
		System.out.println("List is :" + l1);
		
		
		// ********************** other method **************************** 
		
		// give the result true bcz 60 is present in l1
		System.out.println("Contains the element 60 : " +l1.contains(60));
		
		
		// give the result false bcz 67 is not  present in l1
		System.out.println("Contains the element 67 : " +l1.contains(67));
		
		// get the element from l1  
		System.out.println("Get the element: "+l1.get(4));
		
		// find index of element
		System.out.println("Index of element 60 : " + l1.indexOf(60));
		
		// now add duplicate element and find index
		l1.add(60);
		System.out.println("list after add duplicate value 60 :" + l1);
		
		// now find the index of duplicate element. 
		// it will give the first duplicate element index then how to find last duplicate 
		System.out.println("Index of element 60 : " + l1.indexOf(60));
		System.out.println("Index of duplicate element of last One: " +l1.lastIndexOf(60));
		
		// set the new element and remove the element
		l1.set(5, 100);
		System.out.println("Set the new element of index 5 :" + l1);
		
		
		// ***************  accessing arrayList one by one ********************
		
		// using foor lopp
		for(int i = 0; i<l1.size();i++) {
			System.out.println("Arraylist element using foor loop : "+ l1.get(i));
		}
		
		//using for-each loop
		for(Integer x:l1) {
			System.out.println("Arraylist element using for-each loop : " + x);
		}
		
		// using iterator
		Iterator<Integer> it = l1.iterator();
		while(it.hasNext()) {
			System.out.println("Using iterator: "+ it.next());
		}
		
		// using ListTterator
		ListIterator<Integer> it1 = l1.listIterator();
		while(it1.hasNext()) {
			System.out.println("Using List iterator: "+ it1.next()); // check all the method using it1. u can see all method
		}
		
		// also use iterator using for loop
		for(ListIterator<Integer> itt = l1.listIterator();itt.hasNext();) {
			System.out.println(" for loop iterator: "+ itt.next());
		}
		
		// forEach using lamda expression
		l1.forEach(n ->System.out.println("forEach lamda expression: "+n));
		
		//another way use forEach loop
		l1.forEach(System.out::println);
		
		// call show method using lamda expression
		l2.forEach(n->show(n));
		
	}
	
	// out side main method with condition
	static void show (int n) {
		if(n > 50)
			System.out.println("With condition :"+ n);
	}

}

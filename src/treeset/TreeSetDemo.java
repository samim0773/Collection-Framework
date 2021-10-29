package treeset;
import java.util.*;

public class TreeSetDemo {
	public static void main(String[] args) {
		//  tree set is a sorted and remove duplicate value
		TreeSet<Integer> tSet = new TreeSet<>(List.of(10,30,50,70,10,40));
		
		// tree set is a collection interface. we can code also like
//		Collection<Integer> tSet = new TreeSet<>(List.of(10,30,50,70,10,40));
		
		// tree set is also sorted set. we can code also like 
//		SortedSet<Integer> tSet = new TreeSet<>(List.of(10,30,50,70,10,40));
		
		
		
		
		tSet.add(25);
		System.out.println(tSet);
	}

}

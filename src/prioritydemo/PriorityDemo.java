package prioritydemo;
import java.util.*;
/* now if u want to change the priority of large value then u can over write the 
 *comepare 
 */
class MyCom implements Comparator<Integer>{
	public int compare(Integer o1, Integer o2) {
		if(o1<o2)return 1;
		if(o1>o2)return -1;
		return 0;
	}
}

public class PriorityDemo {
public static void main(String[] args) {
		
		/*
		 * 
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		
  		pq.add(20);
  		pq.add(10);
  		pq.add(30);
  		pq.add(5);
  		pq.add(15);
  		pq.add(3);
  		
  		// see the head element
  		//System.out.println(pq.element());
  		System.out.println("Head element: "+pq.peek());
  		
  		// print all element 
  		System.out.println("Print all element");
  		pq.forEach((x)->System.out.println(x));
  		
  		System.out.println("After deleting one element");
  		// delete one element
  		pq.poll();
  		
  		pq.forEach((x)->System.out.println(x));
  		*/
		
		PriorityQueue<Integer> pq = new PriorityQueue<>(new MyCom());
		
  		pq.add(20);
  		pq.add(10);
  		pq.add(30);
  		pq.add(5);
  		pq.add(15);
  		pq.add(3);
  		
  		// see the head element
  		//System.out.println(pq.element());
  		System.out.println("Head element: "+pq.peek());
  		
  		// print all element 
  		System.out.println("Print all element");
  		pq.forEach((x)->System.out.println(x));
  		
  		System.out.println("After deleting one element");
  		// delete one element
  		pq.poll();
  		
  		pq.forEach((x)->System.out.println(x));
  		
	}

}

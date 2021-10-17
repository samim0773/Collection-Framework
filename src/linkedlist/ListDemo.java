package linkedlist;
import java.util.*;

public class ListDemo {
public static void main(String[] args) {
		
		LinkedList <Integer> ll1 = new LinkedList<>();
		LinkedList <Integer> ll2 = new LinkedList<>(List.of(30,40,50));
		
		
		ll1.add(10);
		ll1.add(0,20);
		System.out.println("linked List: "+ll1);		
		System.out.println("linked List: "+ll2);	
//		ll1.addAll(ll2);
//		System.out.println("linked list :" + ll1);
		ll1.addAll(2, ll2);
		System.out.println("linked list with index :"+ll1);
		
		ll1.addFirst(100);
		ll1.addLast(200);
		
		for (int i = 100; i<110; i++) {
			ll1.add(i);
		}
		System.out.println("add using for lopp :"+ ll1);
		
		for(Integer x:ll1) {
			show(x);
		}
	}
	
	static void show(int n) {
		if(n > 40) {
			System.out.println("pint n :" + n);
		}
	}
	

}

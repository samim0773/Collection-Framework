package arraydeque;
import java.util.*;

public class DequeDemo {
public static void main(String[] args) {
		
		ArrayDeque dq = new ArrayDeque<>();
		
		dq.offerLast(10);
		dq.offerLast(20);
		dq.offerLast(30);
		dq.offerLast(40);
		
		// inserting from last and deleting from last means statck
//		dq.pollLast();
		
		// inserting from last and deleting from frist means queue
//		dq.pollFirst();
		
//		System.out.println("Array deque stack :"+dq);
//		dq.forEach((x)->System.out.println(x));   
		/*
		dq.offerFirst(50);
		dq.offerFirst(60);
		dq.offerFirst(70);
		dq.offerFirst(80);
		*/
		dq.forEach((x)->System.out.println(x));
		
		
		
	}

}

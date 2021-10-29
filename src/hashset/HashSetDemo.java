package hashset;
import java.util.*;

public class HashSetDemo {
	public static void main(String[] args) {
		HashSet<Integer> hSet=new HashSet<>();
//		HashSet<Integer> hSet=new HashSet<>(20,0.75f);
		
		hSet.add(10);
		hSet.add(20);
		hSet.add(30);
		hSet.add(10);
		
		System.out.println(hSet);
	}

}

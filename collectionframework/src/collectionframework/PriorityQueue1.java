package collectionframework;
import java.util.*;
public class PriorityQueue1 {

	public static void main(String[] args) {
 
PriorityQueue<Integer> pq =new PriorityQueue<>();	


	pq.offer(40);
	pq.offer(12);
	pq.offer(24);
	pq.offer(36);
	
	System.out.println(pq);
	
	
	pq.poll();
	System.out.println(pq);
		
	}

}

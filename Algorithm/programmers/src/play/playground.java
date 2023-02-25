package play;

import java.util.PriorityQueue;

public class playground {
	public static void main(String[] args) {
		PriorityQueue<Integer> tmp = new PriorityQueue<>();
		tmp.offer(1);
		tmp.offer(2);
		tmp.offer(3);
		tmp.offer(9);
		tmp.offer(4);
		tmp.offer(8);
		
		System.out.println(tmp);
		
		tmp.remove(5);
		
		
		while(!tmp.isEmpty())
			System.out.println(tmp.poll());
		
		
		
		
	}
}

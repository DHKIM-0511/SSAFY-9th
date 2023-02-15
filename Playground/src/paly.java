import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class paly {
	public static void main(String[] args) {
		int[] arr = {1,2,3};
		
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		
		for(int i = 0 ; i < 3 ; i++) {
			System.out.println(list.get(i));
		}
		
		HashSet<Integer> set = new HashSet<>();
		set.add(1);
		set.add(1);
		set.add(2);
		set.add(3);
		
		Iterator<Integer> iter = set.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		HashMap<Integer, String> map = new HashMap<>();
		map.put(1, "일");
		map.put(2, "이");
		map.put(3, "삼");
		
		for(int i = 1 ; i <=3 ; i++) {
			System.out.println(map.get(i));
		}
	}
}
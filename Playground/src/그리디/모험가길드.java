package 그리디;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class 모험가길드 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		ArrayList<Integer> list = new ArrayList<>();
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i = 0 ; i < n ; i++) {
			list.add(Integer.parseInt(st.nextToken()));
		}
		
		int group = 0;
		int people = 0;
		
		for(int i = 0 ; i < n; i++) {
			people+=1;
			if(list.get(i)<=people) {
				group++;
				people=0;
			}
			
		}
		
		System.out.println(group);
	}
}

package day0215;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class 정곤이의단조증가하는수 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int t = Integer.parseInt(br.readLine());
		
		for(int tc = 1 ; tc <= t ; tc++) {
			int ans = 0;
			int n = Integer.parseInt(br.readLine());
			
			int[] arr = new int[n];
			st = new StringTokenizer(br.readLine());
			for(int i = 0 ; i < n ; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			
			ArrayList<Integer> list =new ArrayList<>();
			for(int i = 0 ; i < n ; i++) {
				for(int j = i+1 ; j < n ; j++) {
					list.add(arr[i]*arr[j]);
				}
			}
			int flag = 0;
			
			for(int i = 0 ; i < list.size() ; i++) {
				char[] x = list.get(i).toString().toCharArray();
				
//				for(int j = 1 ; j < x.length ; j++) {
//					if(x[j-1] > x[j]) {
//						ans = -1;
//					}else
//						flag = 1;
//				}
				System.out.println(x.toString()-'0');
			}
			
			
			
//			System.out.println("#"+tc+" "+ans);
		}
		
	}
	
}

package silver2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

		//1 2 3 4 5 6 7 8 - arr

//by	  1 2 3 4  
//ans

		//4 3 6 8 7 5 2 1 - 인풋

public class 스택수열_1874 {
	public static void main(String[] args) throws IOException{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		
		for(int i = 0 ; i < n ; i++)
			arr[i] = i+1;
		
		Stack<Integer> Input = new Stack<>();
		for(int i = 0 ; i < n ;i++)
			Input.push(Integer.parseInt(br.readLine()));
		
		Stack<Integer> by = new Stack<>();
		Stack<Integer> ans = new Stack<>();
		
		
		while(ans.size() != n) {
			int i = 0;
			if(arr[i] <= Input.peek()) {
				by.push(arr[i]);
				i++;
				continue;
			}else if ( arr[i] > Input.peek()) {
				
			}
		}
			
		
		
		
		
		
	}
}

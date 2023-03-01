package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class 신기한소수_2023 {
	 public static StringBuilder sb = new StringBuilder();
	    public static void main(String[] args) throws IOException {
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        int n = Integer.parseInt(br.readLine());
	        find(0,n);
	        System.out.println(sb);
	}

	    public static void find(int input, int n) {
	    	for (int i=0; i<10; i++) {
	    		int next = input*10+i;
	    		if (prime(next))
	    			find(next, n-1);
	    	}
	    }
	    public static boolean prime(int num) {
	    	if (num < 2) return false;

	    	for (int i=2; i<=Math.sqrt(num); i++) {
	    		if (num % i == 0) return false;
	    	}
	    	return true;
	    }
}

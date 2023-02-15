import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 정곤이의단조증가하는수_6190 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int t = Integer.parseInt(br.readLine());
		
		for(int tc = 1 ; tc <= t ; tc++) {
			
			int n = Integer.parseInt(br.readLine());
			
			st = new StringTokenizer(br.readLine());
			int[] A = new int[n];
			int ans = -1;
			
			for(int i = 0 ; i < n ; i++) {
				A[i] = Integer.parseInt(st.nextToken());
			}
			
			for(int i = 0 ; i < n ; i++) {
				for(int j = i+1 ; j < n ; j++ ) {
					
					if(A[i] * A[j] > ans && A[i]*A[j]) { // 단조 증가하는수인가? 에대한 조건..?
						ans = A[i]*A[j];
					}
				}
			}
			
			
			
			System.out.println("#"+tc+" "+ans);
		}	
	
	}
}

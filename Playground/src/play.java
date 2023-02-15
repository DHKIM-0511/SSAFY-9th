import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class play {
	public static void main(String[] args) throws IOException{
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringTokenizer st  = new StringTokenizer(br.readLine());
//		
//		int r = Integer.parseInt(st.nextToken());
//		int c = Integer.parseInt(st.nextToken());
//		
//		
//		
//		int[][] arr =new int[9][9];
//		
//		int[] dr = {-1, 0 , 1 , 1 , 1 , 0 ,-1, -1};
//		int[] dc = {-1,-1 ,-1 , 0 , 1 , 1 , 1 , 0};
//		
//		for(int i = 0 ; i < 9 ; i ++) {
//			for(int j = 0 ; j < 9 ; j++) {
//				
//				if(i == r && j == c) {
//					for(int d = 0 ; d < 8 ; d++) {
//						int nr = i + dr[d];
//						int nc = j + dc[d];
//						
//						if(nr >= 0 && nr < 9 && nc >= 0 && nc < 9) {
//							
//								arr[nr][nc]++;
//						}
//					}
//				}
//				
//				
//			}
//		}
//		
//		
//		for(int[] i : arr) {
//			for(int j : i) {
//				System.out.print(j);
//			}
//			System.out.println();
//		}
		
		Person a = new Person();
		System.out.println(a.getA());
	}
}

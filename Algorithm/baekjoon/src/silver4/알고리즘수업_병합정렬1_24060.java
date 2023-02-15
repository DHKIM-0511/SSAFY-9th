import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 알고리즘수업_병합정렬1_24060 {
	static int[] tmp;
	static int count = 0;
	static int result = -1;
	static int K;
	
	public static void merge_sort(int[] A, int start, int end) {
		
		if(start < end) {
			int mid = (start + end) / 2;
			merge_sort(A, start, mid);
			merge_sort(A, mid+1, end);
			merge(A, start, mid, end);
			
		}
	}
	
	public static void merge(int[] A, int start, int mid, int end) {
		int i = start;
		int j = mid+1;
		int t = 0;
		
		while(i <= mid && j <= end) {
			if(A[i] <= A[j]) {
				tmp[t++] = A[i++];
			}
			else {
				tmp[t++] = A[j++];
			}
		}
		while(i <= mid)
			tmp[t++] = A[i++];
		while(j <= end)
			tmp[t++] = A[j++];
		
		i = start;
		t=0;
		while(i <= end) {
			count++;
			if(count == K) {
				result = tmp[t];
				break;
			}
			A[i++] = tmp[t++];
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		int[] arr = new int[n];
		tmp = new int[n];
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0 ; i < n ; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		merge_sort(arr, 0, arr.length-1);
		System.out.println(result);
		
	}
}

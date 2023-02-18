package 정렬;

import java.util.Arrays;

public class 카운팅정렬 {
	public static void main(String[] args) {
		int[] arr = {5, 2, 4, 1, 2, 3, 3};
		
		System.out.println(Arrays.toString(arr));
		
		// 0단계
		// 주어진 배열 arr에서 최대값을 찾는다.
		// 그 수를 이용해서 카운팅 배열을 만든다.
		
		// 최대값
		int k = -1;
		for(int i=0; i<arr.length; i++) {
			if (k < arr[i])
				k = arr[i];
		}
		
		
		// 1단계
		// counting 배열
		// count[i] : i의 개수
		int[] count = new int[k+1]; // 인덱스 5까지 쓸 것이므로..
		
		for(int i=0; i<arr.length; i++) {
			count[arr[i]]++;
		}
		
		System.out.println(Arrays.toString(count));
		
		// 누적합 배열
		// prefix sum
		// prefix[i] = count[0] + count[1] + count[2]+ ... + count[i];
		// cf.) suffix[i] = count[i] + count[i+1] + ... + count[n-2] + count[n-1];

		// 굳이 배열을 하나 더 만들지 않고..
		
//		int[] prefix = new int[6];
//		prefix[0] = count[0];
//		for(int i=1; i<=5; i++) {
//			prefix[i] = prefix[i-1] + count[i];
//		}
		
		// 2단계
		// count 배열을 => prefix 배열로
		for(int i=1; i<=5; i++) {
			count[i] += count[i-1];
		}
		System.out.println(Arrays.toString(count));
		
		// 3단계
		// arr 배열을 다시 돌면서,
		// 새로운 배열의 새로운 좌표에 옮긴다.
		int[] arr2 = new int[arr.length];
		for(int i=0; i<arr.length; i++) {
			arr2[count[arr[i]] - 1] = arr[i];
			count[arr[i]]--;
		}
		System.out.println(Arrays.toString(arr2));
		
		System.out.println(Arrays.toString(count));
	}
}

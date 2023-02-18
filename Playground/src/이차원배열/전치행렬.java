package 이차원배열;

import java.util.Arrays;

public class 전치행렬 {
	public static void main(String[] args) {
		// 전치행렬
		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int N = 3;
		for (int[] a : arr) {
			System.out.println(Arrays.toString(a));
		}

		// 전치행렬
//		for (int i = 0; i < N; i++) {
//			for (int j = 0; j < N; j++) {
//				if (i < j) {
//					int tmp = arr[i][j];
//					arr[i][j] = arr[j][i];
//					arr[j][i] = tmp;
//				}
//			}
//		}
//		System.out.println("----------------------");
//		for (int[] a : arr) {
//			System.out.println(Arrays.toString(a));
//		}

		//윗삼각형 영역
		for (int i = 0; i < N; i++) {
			for (int j = i + 1; j < N; j++) {
				int tmp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = tmp;
			}
		}
		System.out.println("----------------------");
		for (int[] a : arr) {
			System.out.println(Arrays.toString(a));
		}
	}
}

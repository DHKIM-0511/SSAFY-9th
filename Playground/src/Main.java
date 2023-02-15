
public class Main{
	public static void main(String[] args) {
		int cnt = 1;
		int left = 0;
		int right = 2;

		
//		for(int i = 0 ; i < 5 ; i++) {
//			for(int j = 0 ; j < 5 ; j++) {
//				if(j>=left) {
//					System.out.printf("%4d",cnt++);
//				}
//				else{
//					System.out.print("    ");
//				}
//			}
//			System.out.println();
//			left++;
//		}
		
//		for(int i = 0 ; i < 5 ; i++) {
//			for(int j = 0 ; j < 5 ; j++) {
//				if(j >= left && j <=right) {
//					System.out.printf("%4d",cnt++);
//				}else
//					System.out.print("    ");
//				
//			}
//			System.out.println();
//			if(i<2) {
//				left++;
//				right--;
//			}else {
//				left--;
//				right++;
//			}				
//		}
		
//		for(int i = 0 ; i < 5 ; i++) {
//			for(int j = 0 ; j < 5 ; j++) {
//				if(j>=left && j<=right) {
//					System.out.printf("%4d",cnt++);
//				}else {
//					System.out.print("    ");
//				}
//			}
//			System.out.println();
//			if(i <2) {
//				left--;
//				right++;
//			}else {
//				left++;
//				right--;
//			}
//		}
		
		
		for(int i = 0 ; i < 5 ; i++) {
			for(int j = 0 ; j < 5 ; j++) {
				if(j>=left) {
					System.out.printf("%4d", cnt++);
				}else
					System.out.print("    ");
				
			}
			System.out.println();
			left++;
		}
		
		
	}
}
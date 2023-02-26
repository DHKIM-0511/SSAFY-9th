package 탐색알고리즘;

public class nQueen {
    static int[] col;
    static int n;

    public static void main(String[] args) {
        n = 8; // 8-Queen 문제
        col = new int[n+1];

        nQueen(0);
    }

    public static void nQueen(int i) {
        if (promising(i)) { // 해당 노드가 후보 해답이 될 가능성이 있는가?
            if (i == n) { // 모든 퀸을 놓을 수 있다면, 답을 출력하고 리턴
                for (int j = 1; j <= n; j++)
                    System.out.print(col[j] + " ");
                System.out.println();
                return;
            }
            for (int j = 1; j <= n; j++) { // 다음 퀸을 놓기 위해 반복
                col[i + 1] = j;
                nQueen(i + 1);
            }
        }
    }
		//다음 퀸을 놓아도 서로 공격할 수 없는 가능성이 있는지를 체크하는 메서드입니다.
    public static boolean promising(int i) { 
        int k = 1;
        boolean promising = true;

        while (k < i && promising) {
            if (col[i] == col[k] || Math.abs(col[i] - col[k]) == i - k) // 같은 열이나 대각선 상에 존재하는가?
                promising = false;
            k++;
        }

        return promising;
    }
}

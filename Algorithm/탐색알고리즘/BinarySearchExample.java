package 탐색알고리즘;

public class BinarySearchExample {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        int target = 4;
        int result = binarySearch(arr, target);
        if (result == -1) {
            System.out.println("원소가 배열에 존재하지 않습니다.");
        } else {
            System.out.println("원소가 배열의 " + (result + 1) + "번째 인덱스에 있습니다.");
        }
    }

    static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}


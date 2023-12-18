public class BinaryTest03 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
        int N = arr.length;
        int target = 13;

        int start = 0;
        int end = N - 1;
        int mid;

        for (int i = 1; start <= end; i++) {
            mid = (start + end) / 2;

            System.out.println("mid: arr[" + mid + "] = " + arr[mid]);
            System.out.println(i +"회전 start: " + start + ", end: " + end);

            if (arr[mid] == target) {
                System.out.println(target + "값은 " + mid + "번지에 있습니다");
                break;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        if (start > end) {
            System.out.println(target + "값은 배열에 없습니다.");
        }
    }
}

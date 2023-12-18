package ex03.test;

public class BubbleTest04 {
    public static void main(String[] args) {
        int[] arr = {5, 8, 2, 4, 3};
        final int N = arr.length;
        int temp;

        for (int i = 0; i < N - 1; i++) {
            if (arr[0] > arr[1]) {
                temp = arr[0];
                arr[0] = arr[1];
                arr[1] = temp;
            }

            for (int j = 0; j < N - 2; j++) {
                if (arr[1] > arr[2]) {
                    temp = arr[1];
                    arr[1] = arr[2];
                    arr[2] = temp;
                }

                for (int k = 0; k < N - 3; k++) {
                    if (arr[2] > arr[3]) {
                        temp = arr[2];
                        arr[2] = arr[3];
                        arr[3] = temp;
                    }

                    for (int m = 0; m < N - 4; m++) {
                        if (arr[3] > arr[4]) {
                            temp = arr[3];
                            arr[3] = arr[4];
                            arr[4] = temp;
                        }

                        for (int n = 0; n < N; n++) {
                            System.out.print(arr[n] + " ");
                        }
                        System.out.println();
                    }
                }
            }
        }
    }
}
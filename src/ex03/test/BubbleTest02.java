package ex03.test;

public class BubbleTest02 {
    public static void main(String[] args) {
        int[] arr = {5, 8, 2, 4, 3};

        final int N = arr.length;
        //4바퀴 돌고 내부적으로 4, 3, 2, 1  바퀴 돌기
        for (int i = 0; i < N - 1; i++) {

            for (int J = 0; J < N - i - 1; J++) {
                System.out.println("몇바퀴돌까?");
            }
            System.out.println();
        }
    }
}

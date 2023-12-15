package ex03.test;

public class BubbleTest01 {
    public static void main(String[] args) {
        int[] arr = {5, 8, 2, 4, 3};

        final int N = arr.length;

        //네바퀴돌기
        for (int i = 0; i < N-1; i++) {
            System.out.println("몇번돌지?");

        }

        //4바퀴 돌고 내부적으로 4바퀴 돌기
        for (int i = 0; i < N-1; i++) {
            for (int J = 0; J < N-1; J++)
                System.out.println("몇바퀴돌까?");

        }
    }
}

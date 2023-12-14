package ex03;

public class GugudanTest {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 2; j <= 9; j++) {
                int result = j * i;
                System.out.print(j + " * " + i + " = " + (result < 10 ? " " : "") + result + "\t");
            }
            System.out.println(); // 각 단이 끝나면 줄 바꿈
        }
    }
}


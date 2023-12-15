package ex03;

import java.util.Scanner;

/*2~9단까지 출력되는 프로그램을 만드시오
스캐너를 이용하여 입력받은 단만 출력하시오*/
public class GugudanEx01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("단 수를 입력하세요 , 바위(1), 보(2): ");
        int user = sc.nextInt();

        for (int x = 2; x < 9; x++) { //2단부터 9단까지
            for (int i = 1; i < 9; i++) {
                System.out.println(x + "*" + i + "=" + x * i);

            }

        }

    }
}

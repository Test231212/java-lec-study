package ex03;

class Gugudanutil {
    static void gugudan(int x) {
        for (int i = 1; i <= 9; i++) {
            System.out.println(x + "*" + i + "=" + (x * i));
        }
        System.out.println();
    }
}

    public class GugudanEx04 {

        public static void main(String[] args) {
            // Gugudanutil 메서드에 gugudan 정적 메서드를 호출하시오.
            // Parameter는 int 하나가 필요합니다.
            // 구구단을 출력 해주는 메서드
            Gugudanutil.gugudan(10);
        }
    }



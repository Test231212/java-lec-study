package ex01;

public class VarEx01 {

    //모든 코드는 main 메서드 내부에 적는다.
    public static void main(String[] args) {
        int n1 = 1; //21억까지 (4byte)
        double d1 = 1.5; //21억까지 (8byte)
        long big1 = 20000000000l; //경까지 (8byte)
        boolean b1 = true; //true, false (1 bit) false는 0 true는 1 사용
        char c1 = '가';

        System.out.println(n1);
        System.out.println(d1);
        System.out.println(big1);
        System.out.println(b1);
        System.out.println(c1);
    } //자바 프로그램 종료
}

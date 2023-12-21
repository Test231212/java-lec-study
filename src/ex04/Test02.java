package ex04;

public class Test02 {
    public static int cube(int x) {
        int result = x*x*x;
        return result;
    }
    public static void main(String[] args) {
        System.out.println("10*10*10은 "+cube(10));
    }
}

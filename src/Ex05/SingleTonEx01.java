package Ex05;

class President {
    String name;

    static President instance = new President();
    private President(){}
}
public class SingleTonEx01 {
    public static void main(String[] args) {
        President p1 = President.instance;
        System.out.println(p1.hashCode());

        President p2 = President.instance;
        System.out.println(p2.hashCode());

        //President p3 = new President(); 생성자에 접근을 할 수 없음 (private)
    }
}

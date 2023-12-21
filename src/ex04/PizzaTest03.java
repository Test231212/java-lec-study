package ex04;

public class PizzaTest03 {
    public static void main(String[] args) {
        Pizza03 p1 = new Pizza03("Super Supreme");
        Pizza03 p2 = new Pizza03("Cheese");
        Pizza03 p3 = new Pizza03("Pepperoni");
        int n = Pizza03.count;
        System.out.println("지금까지 판매된 피자 개수 + " + n);
    }
}

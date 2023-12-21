package ex04;

public class Pizza03 {
    private String toppings;
    private int radius;
    static final double PI = 3.141592;
    static int count = 0;

    public Pizza03(String toppings){
        this.toppings = toppings;
        count++;
    }
}

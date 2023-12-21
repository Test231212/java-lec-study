package ex04;

class Pizza002 {
    int radius;

    Pizza002(int r) {
        radius = r;
    }
    Pizza002 whosLargest(Pizza002 p1, Pizza002 p2) {
        if(p1.radius > p2.radius)
            return p1;
        else
            return p2;
    }
}
public class PizzaTest02 {
    public static void main(String args[]) {
        Pizza002 obj1 = new Pizza002(14);
        Pizza002 obj2 = new Pizza002(18);

        Pizza002 largest = obj1.whosLargest(obj1, obj2);
        System.out.println(largest.radius + "인치 피자가 더 큼.");
    }
}

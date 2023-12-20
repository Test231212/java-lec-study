package ex04;

public class Account {
    private int regNumber; // private 선언, 클래스 내부에서만 사용 가능하다.
    private String name;
    private int balance;

    public String getName() {   return name; } // 접근자와 설정자를 사용하고 있다.
    public void setName(String name) {   this.name = name; }
    public int getBalance() {   return balance; }
    public void setBalance(int balance) {   this.balance = balance; }

}
class AccountTest {
    public static void main(String[] args) {
        Account obj = new Account();
        obj.setName("Tom");
        obj.setBalance(100000);
        System.out.println("이름은 " + obj.getName() + "통장 잔고는 "
                + obj.getBalance() + "입니다.");
    }
}

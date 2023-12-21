package ex04.example.model;

public class Account {
    final int id; // 계좌번호 (숫자 10자리로 만들어져있다.)
    long balance;
    int Userid; // 1

    public Account(int id, long balance, int userid) {
        this.id = id;
        this.balance = balance;
        Userid = userid;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", balance=" + balance +
                ", Userid=" + Userid +
                '}';
    }
}

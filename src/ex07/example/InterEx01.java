package ex07.example;

interface Remocon {
    //public abstract 생략가능
    void on();

    void off();
}

class SamsungRemocon implements Remocon {

    @Override
    public void on() {
        System.out.println("삼성 리모컨 on");

    }

    @Override
    public void off() {
        System.out.println("삼성 리모컨 off");

    }
}

class LgRemocon implements Remocon {

    @Override
    public void on() {
        System.out.println("엘지 리모컨 on");

    }

    @Override
    public void off() {
        System.out.println("엘지 리모컨 off");

    }
}

/**
 *  작성자 : 홍길동
 *  작성일 : 2023년 12월 26일
 *  구현체 : SamsungRemocon, LgRemocon
 */
class CommonRemocon {
    private Remocon r; // 인터페이스 or 추상 클래스

    public CommonRemocon(Remocon r) {
        this.r = r;
    }

    public void on(){
        r.on();
    }

    public void off(){
        r.off();
    }
}

public class InterEx01 {

    public static void main(String[] args) {
        CommonRemocon cr = new CommonRemocon(new SamsungRemocon());
        cr.on();
       // Remocon samsung = new SamsungRemocon(); // [Remocon, SamsungRemocon]
       // samsung.on();


    }
}

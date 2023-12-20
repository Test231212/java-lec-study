package ex04;


class Cat {
    String name;

    Cat(){ //보통 생략한다.
       // this.name = "토비";
        this("토비");
    }

    Cat(String name) {
        this.name = name;
    }
}
public class HeapEx01 {
    public static void main(String[] args) {
        Cat c = new Cat();
    }
}

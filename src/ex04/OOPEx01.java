package ex04;

class Person3 {
    // 상태
    int weight = 100;

   // 행위 = 메서드
    public void exercise(){
        weight = weight -10;

    }
}
public class OOPEx01 {
    public static void main(String[] args) {

        Person3 p3 = new Person3();
        System.out.println("p3의 몸무게 : " + p3.weight);



    }
}

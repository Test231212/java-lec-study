package ex04;

import java.sql.SQLOutput;

class Person2 {
    int age = 10;
    char gender = '남';
}
public class MemEx02 {
    public static void main(String[] args) {
        System.out.println("1년 지남");
        System.out.println("2년 지남");
        System.out.println("3년 지남");

        Person2 p2 = new Person2(); //new 뒤에 class명
        System.out.println(p2.age);
        System.out.println(p2.gender); //'class명.~~' 은 static

        System.out.println("메인 종료");

    }






}

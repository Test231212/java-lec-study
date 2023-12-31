package ex06;

class Employee02 {
    public int baseSalary = 3000000; // 기본금

    int getSalary() {
        return baseSalary;
    }
}

class Manager extends Employee02 {
    @Override
    int getSalary() {
        return (baseSalary + 2000000); // 상위 클래스의 기본금을 가져와 추가 수당을 더함
    }
}

class Programmer extends Employee02 {
    @Override
    int getSalary() {
        return (baseSalary + 3000000); // 상위 클래스의 기본금을 가져와 추가 수당을 더함
    }
}

public class Test {
    public static void main(String[] args) {
        Manager obj1 = new Manager();
        System.out.println("관리자의 월급: " + obj1.getSalary());

        Programmer obj2 = new Programmer();
        System.out.println("프로그래머의 월급: " + obj2.getSalary());
    }
}


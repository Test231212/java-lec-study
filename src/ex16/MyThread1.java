package ex16;

public class MyThread1 extends Thread {
    Printer prn;
    int[] myarr = { 10, 20, 30, 40, 50 };

    MyThread1(Printer prn) {        this.prn = prn;   }
    public void run() {         prn.print(myarr);   }
}

class MyThread2 extends Thread {
    Printer prn;
    int[] myarr = {1, 2, 3, 4, 5 };

    MyThread2(Printer prn) {        this.prn = prn;   }
    public void run() {         prn.print(myarr);   }
}


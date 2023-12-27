package ex03.test;

interface 행위 {
    void start();
}

class 삼양라면 implements 행위 {
    private void 물끓이기() {
    }

    private void 스프넣기() {
    }

    private void 면넣기() {
    }

    private void 계란넣기() {
    }

    @Override
    public void start() {
        물끓이기();
        면넣기();
        스프넣기();
        계란넣기();
    }
}

class 신라면 implements 행위 {

    private void 물끓이기() {
    }

    private void 스프넣기() {
    }

    private void 면넣기() {
    }

    private void 계란넣기() {
    }

    @Override
    public void start() {
        물끓이기();
        스프넣기();
        면넣기();
        계란넣기();
    }
}


public class Ramen {
    public static void main(String[] args) {
        삼양라면 la = new 삼양라면();
        la.start();

        신라면 la2 = new 신라면();
        la2.start();
    }
}

package ex16.example5;

class Printer {
    void print(int[] arr) throws Exception {
        synchronized (this) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+" ");
            Thread.sleep(100);
            }
        }
    }
}

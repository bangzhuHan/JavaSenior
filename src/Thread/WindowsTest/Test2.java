package Thread.WindowsTest;

public class Test2 {
    public static void main(String[] args) {
        WindowsTest2 w1 = new WindowsTest2();
        Thread thread1 = new Thread(w1);
        Thread thread2 = new Thread(w1);
        Thread thread3 = new Thread(w1);
        thread1.setName("窗口1");
        thread2.setName("窗口2");
        thread3.setName("窗口3");
        thread1.start();
        thread2.start();
        thread3.start();
    }
}

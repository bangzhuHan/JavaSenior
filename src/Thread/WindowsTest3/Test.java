package Thread.WindowsTest3;

import Thread.WindowsTest.WindowsTest2;
import Thread.WindowsTest2.Windows;

public class Test {
    public static void main(String[] args) {
        Windows2 w1 = new Windows2();
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

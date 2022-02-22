package Thread.WindowsTest;

public class Test {
    public static void main(String[] args) {
        WindowsTest w1 = new WindowsTest();
        w1.setName("窗口1");
        WindowsTest w2 = new WindowsTest();
        w2.setName("窗口2");
        WindowsTest w3 = new WindowsTest();
        w3.setName("窗口3");
        w1.start();
        w2.start();
        w3.start();
    }
}

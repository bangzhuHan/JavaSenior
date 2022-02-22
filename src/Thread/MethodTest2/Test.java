package Thread.MethodTest2;

public class Test {
    public static void main(String[] args) {
        Method2 method2 = new Method2();
        Thread thread1 = new Thread(method2);
        thread1.getName();
        thread1.start();

        Thread thread2 = new Thread(method2);
        thread2.setName("线程2");
        thread2.start();
    }
}

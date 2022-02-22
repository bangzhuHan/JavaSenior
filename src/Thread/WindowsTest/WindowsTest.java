package Thread.WindowsTest;

/**
    创建多线程方式二：实现runnable接口
    1. 创建一个实现了Runnable接口的类
    2. 实现类去实现Runnable中的抽象方法：run()
    3. 创建实现类的对象
    4. 将此对象作为参数传递到Thread类的构造器中，创建Thread类的对象
    5. 通过Thread类的对象调用start()

    比较创建线程的两种方式：
    开发中优先选择实现runnable接口方式
    原因：1.实现的方式没有类的单继承性的局限性
         2.实现的方式更适合来处理多个线程有共享数据的情况
    联系：public class Thread implements Runnable
    相同点：都需要重写run（）,并在其中声明逻辑
 */

public class WindowsTest extends Thread{
    private static int ticket = 100;
    public void run() {
        while(true) {
            if (ticket > 0) {
                System.out.println(getName() + ":卖票，票号为：" + ticket);
                ticket--;
            }
            else break;
        }
    }
}

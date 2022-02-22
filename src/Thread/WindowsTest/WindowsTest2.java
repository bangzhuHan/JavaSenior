package Thread.WindowsTest;

/**
 * 通过创建接口的方式实现卖票
 */
/*
例子：创建三个窗口卖票，总票数为100张,使用Runnable接口的方式
存在线程安全问题，待解决。
使用synchronized关键字
1. 包住涉及到共享数据的代码块  包的不能多也不能少。
2， new一个对象充当锁
3. 要求：多个线程共用同一把锁,所以锁（对象）的声明位置很重要！！！（匿名类对象也不行）
4. 同步方式好处：解决线程安全问题；操作同步代码时，只能有一个线程参与，其他线程等待，相当于单线程的过程，效率低。-- 缺点。
 */

public class WindowsTest2 implements Runnable{
    private  int ticket = 100;
    Cat cat = new Cat();

    @Override
    public void run() {
        //Cat cat = new Cat();锁设置在这个位置，会有三个
        while(true){
            //synchronized(cat) {//若在此处括号使用匿名对象，会有更多的锁（同步监视器）
            synchronized(this){//接口实现多线程问题中，可以使用当前类对象来充当锁，因为该对象只new了一次
            try {
                    Thread.currentThread().sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (ticket > 0) {
                    System.out.println(Thread.currentThread().getName() + ":" + ticket);
                    ticket--;
                } else break;
            }
        }
    }
}

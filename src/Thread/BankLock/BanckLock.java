package Thread.BankLock;

import java.util.concurrent.locks.ReentrantLock;

public class BanckLock implements Runnable{
    private int ticket = 100;
    //1.实例化ReentrantLock
    private ReentrantLock reentrantLock = new ReentrantLock();
    @Override
    public void run() {
        while(true){
            //2.调用加锁方法lock()
            reentrantLock.lock();
            try{
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if(ticket > 0) System.out.println(Thread.currentThread().getName() + ":" + ticket--);
            }finally {
                //3.调用解锁方法unlock()
                reentrantLock.unlock();
            }
        }
    }
}

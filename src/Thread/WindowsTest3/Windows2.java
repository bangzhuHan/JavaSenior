package Thread.WindowsTest3;

/**
 * 同步方法解决实现Runnable接口的安全问题
 *
 */
public class Windows2 implements Runnable{
    private static int ticket = 100;
    private static Object object = new Thread();

    @Override
    public void run() {
        while(ticket > 0) {
            show();
        }
    }
    private synchronized void show() {//同步监视器：this
        if (ticket > 0) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "抢票：" + ticket--);
        }
    }
}



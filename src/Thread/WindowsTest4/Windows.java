package Thread.WindowsTest4;

/**
 * 关于同步方法的总结：
 * 1.同步方法仍然涉及到同步监视器，只是不需要显示声明
 * 2.非静态的方法：监视器为this
 *   静态的同步方法：监视器为当前类this.class
 */
public class Windows extends Thread{
    private static int ticket = 100;
    private static Object object = new Thread();

    @Override
    public void run() {
        while(ticket > 0){
            show();
        }
    }
    private static synchronized void show(){//监视器为Windows.class
            //private static synchronized void show() 监视器为this
        if(ticket > 0){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
             System.out.println(Thread.currentThread().getName() + "抢票：" + ticket--);
        }
    }
}
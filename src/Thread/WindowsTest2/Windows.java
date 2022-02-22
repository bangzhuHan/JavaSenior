package Thread.WindowsTest2;

/**
 * 采用继承子类实现多线程时，要使锁共享(此例子中要加static)
 */
public class Windows extends Thread{
    private static int ticket = 100;
    private static Object object = new Thread();

    @Override
    public void run() {
        while(true){
            //synchronized(object){
              synchronized(Windows.class){//Class clazz =Windows.class;
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if(ticket > 0) System.out.println(Thread.currentThread().getName() + "抢票：" + ticket--);
                else break;
            }
        }
    }
}

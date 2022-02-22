package Thread.MethodTest;

public class ThreadMethodTest {
    public static void main(String[] args) {
        SubThread3 s1 = new SubThread3("Thread - 1");//也可以通过构造器的方式来命名
        s1.setName("Thread 1:");//子类线程命名
        s1.setPriority(Thread.MAX_PRIORITY);//子类线程设置为最大优先级
        s1.start();

        //主线程命名
        Thread.currentThread().setName("主线程");
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) System.out.println(Thread.currentThread().getName() +Thread.currentThread().getPriority() + "：偶数" + i);
            if(i == 30) {
                try {
                    s1.join();  //在线程A中调用线程B的join（）方法，此时线程A进入阻塞状态，直到b结束A才接着来
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println(s1.isAlive());
    }
}

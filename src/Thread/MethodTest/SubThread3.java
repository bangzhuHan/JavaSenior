package Thread.MethodTest;
/**
    1.void start() 启动线程并执行的对象的run()方法
    2.run() 线程在被调度时执行的操作，常需要重写该方法
    3.String getName(): 返回线程的名称
    4.void setName(String name): 设置该线程名称
    5.static Thread currentThread(): 返回当前线程。
    6.yield(): 释放当前CPU的执行权
    7.join(): 阻塞当前线程，先完成join进来的方法再恢复之前的执行。
    8.stop(): 强制结束线程，已过时。
    9.sleep(long milltime): 阻塞，线程睡眠一段时间，单位毫秒
    10.isAlive(): 判断当前线程是否还存活

    线程的优先级：
    1.
    MAX_PRIORITY：10
    MIN_PRIORITY:1
    NORM_PRIORITY:5
    2.getPriority()与setPriority():获取与设置
    注意：高优先级线程要抢占低优先级CPU的执行权，但只是概率上讲高优先级线程高概率会被执行。并不等同与join()那样
 */
public class SubThread3 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
           /* if(i % 2 == 0) {
                try {
                    this.sleep(1000 );
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }*/
            if(i % 2 == 0)
                System.out.println(Thread.currentThread().getName() + getPriority() +"偶数 " + i);

                if(i % 20 == 0) Thread.currentThread().yield();//this.yield();
        }
    }

    public SubThread3(String name) {
        super(name);
    }
}


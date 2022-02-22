package Thread.Exercise;

public class ThreadTest {
    public static void main(String[] args) {
        //    SubThread1 e1 = new SubThread1();
        //    e1.start(); //遍历偶数
        //    SubThread2 e2 = new SubThread2();
        //    e2.start();//遍历奇数
        //创建匿名子类的方式实现上述操作 --> 匿名子类：就地重写Thread类
        new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    if (i % 2 == 0) System.out.println(Thread.currentThread().getName() + "：偶数" + i);
                }
            }
        }.start();
        new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    if(!(i % 2 == 0)) System.out.println(Thread.currentThread().getName() +"：奇数" + i);
                }
            }
        }.start();
    }
}


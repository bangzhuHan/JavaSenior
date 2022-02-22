package Thread;
//多线程的创建方式一：继承Thread类
/*
 * 1. 创建一个继承于Thread类的子类
 * 2. 重写Thread类的run()
 * 3. 创建Thread类的子类的对象
 * 4. 通过此对象调用start()
 * */

//遍历100以内的偶数
//1. 创建一个继承于Thread类的子类
 class MyThread  extends Thread {
    //2. 重写Thread类的run()
    @Override
    public void run(){
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0){
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }
        }
    }
}

 class ThreadTest01{
    public static void main(String[] args) {
        //3. 创建Thread类的子类的对象
        MyThread myThread = new MyThread();
        //4. 通过此对象调用start():1.启动当前线程 2.调用当前线程的run()
        //不能使用run()启动线程
        //若再启动一个线程去遍历100内偶数，需重新创建一个对象再来启用当前线程，也就是说一个线程只能被启用一次
        myThread.start();

        for (int i = 0; i < 100; i++) {
            if (i % 2 != 0){
                System.out.print(Thread.currentThread().getName() + ":" + i + " ");
            }
        }


    }
}


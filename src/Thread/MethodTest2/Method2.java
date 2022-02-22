package Thread.MethodTest2;

/**
 * 创建方式2:实现Runnable接口
 * 1.创建一个实现了Runnable接口的类
 * 2.实现类中的抽象方法run()
 * 3.创建实现类的对象
 * 4.将此对象作为参数传递到Thread的构造器中，创建Thread类的对象
 * 5.通过Thread类的对象调用start()
 */
public class Method2 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if(i % 2 == 0)
                System.out.println(Thread.currentThread().getName() + ":" + i);
        }
    }
}

package Collection.Test;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;

public class IteratorTest {
    @Test
    public void test(){
        Collection collection = new ArrayList();
        collection.add(111);
        collection.add(new String("Curry"));
        collection.add(new Date());


        //返回Iterator接口的实例,用于遍历集合元素。放在IteratorTest.java中
        Iterator iterator = collection.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        /*不推荐
        for (int i = 0; i < collection.size(); i++) {
            System.out.println(iterator.next());
        }*/

        /*不推荐
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.next());*/


        //错误方式1
//        while (iterator.next() != null)
//            System.out.println(iterator.next());

        //错误方式二:死循环。collection.iterator()每次都产生新的迭代器
        while (collection.iterator().hasNext()){
            System.out.println(collection.iterator().next());
        }

    }

    @Test
    public void test4(){
        Collection collection = new ArrayList();
        collection.add(111);
        collection.add(new String("Curry"));
        collection.add(new Date());
        collection.add(false);

        Iterator iterator = collection.iterator();
        //删除“Curr”对象
        while(iterator.hasNext()){
            Object obj = iterator.next();
            if("Curry".equals(obj))
                iterator.remove();
        }
        //System.out.println(collection);

        //重新遍历集合
        Iterator iterator2 = collection.iterator();
        while (iterator2.hasNext()){
            System.out.println(iterator2.next());
        }



    }
}

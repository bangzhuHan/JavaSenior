package Collection.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Test {
    @org.junit.jupiter.api.Test
    public void Test1(){
        //1.contains(Object obj):判断当前集合是否含有obj
        Collection collection = new ArrayList();
        collection.add(111);
        collection.add(345);
        collection.add(new String("Curry"));
        collection.add(new Person("张三",15));

        Boolean contains = collection.contains(3456);
        System.out.println(contains);
        System.out.println(collection.contains(new Person("张三",15)));//调用已重写的equals方法
    }

    @org.junit.jupiter.api.Test
    public void Test2(){
        Collection collection = new ArrayList();
        collection.add(111);
        collection.add(345);
        collection.add(new String("Curry"));
        collection.add(new Person("张三",15));

        //3.remove(Object obj):差集：从当前集合中移除对象
        collection.remove(111);
        System.out.println(collection);
        collection.remove(new Person("张三",15));
        System.out.println(collection);

        //4.removeAll(Collection coll):差集:从当前集合中移除含有coll中的所有元素

        //collection.removeAll(coll);
        //System.out.println(collection);

        Collection coll = new ArrayList();
        coll.add(111);
        coll.add(new String("Curry"));
        coll.add(345);
        //5.retainsAll(Collection coll):交集,返回给当前集合
        collection.retainAll(coll);
        System.out.println(collection);

        //equals(Object obj):判断当前集合和obj（集合）是否相等
        Collection collection1 = new ArrayList();
        collection1.add(345);
        collection1.add("Curry");
        System.out.println(collection.equals(collection1));;

    }

    @org.junit.jupiter.api.Test
    public void test3(){
        Collection collection = new ArrayList();
        collection.add(111);
        collection.add(345);
        collection.add(new String("Curry"));
        collection.add(new Person("张三",15));

        //hashCode():返回当前对象的哈希值
        System.out.println(collection.hashCode());

        //toArray():集合--->数组
        Object [] array = collection.toArray();
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        //拓展:数组--->集合:调用Array类的静态方法asList()
        List<String> list = Arrays.asList(new String[]{"AA","BB","CC"});
        System.out.println(list);

        List arr1 = Arrays.asList(new int[]{1,2,4});
        System.out.println(arr1);//输出：[[I@797badd3]

        List arr2 = Arrays.asList(new Integer[]{1,2,4});
        System.out.println(arr2);//输出：[1, 2, 4]
    }
}

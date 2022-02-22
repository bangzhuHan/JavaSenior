package Collection;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

/**
 * 一、集合框架的概述
 * 1.集合、数组都是对多个数据进行存储操作的结构，简称Java容器
 * 说明：此处存储指内存层面的存储，不涉及到持久化层面的存储（.txt,.jpg,.avi,数据库中）
 *
 * 2.1数组存储的特点：
 * >初始化后长度确定
 * >元素类型固定，比如：String[] arr;int[] arr1;Object[] arr2;
 * 2.2数组存储的缺点：
 * >一旦初始化后，长度不可修改
 * >数组中提供的方法非常有限，对于添加、删除、插入数据等操作，非常不便，效率不高
 * >数组的特点：有序，可重复。无法实现无序、不重复的需求
 * >获取数组中实际元素的个数的需求，没有现成的方法使用
 *
 *二、集合框架
 *      |----Collection接口：单列集合，用来存储一个一个的对象
 *              |----List接口：存储有序的、可重复的数据 ———>”动态“数组
 *                  |----ArrayList、LinkedList、Vector
 *
 *              |----Set接口：存储无序的、不可重复的数据
 *                 |----HashSet、LinkedHashSet、TreeSet
 *
 *      |----Map接口：双列集合，用来存储一对（key - value）的数据 --->函数 y = f（x）
 *              |----HashMap、LinkedHashMap、TreeMap、HashTable、Properties
 */
public class CollectionTest {
    @Test
    public void test1(){
        Collection collection = new ArrayList();

        //add(Object e):将元素e添加到集合coll中
        collection.add("AAA");
        collection.add("BBB");
        collection.add(124);//自动装箱
        collection.add(new Date());

        //size():获取当前添加元素的个数
        System.out.println(collection.size());

        //addAll(Collection coll1):将coll1集合中的元素添加到当前的集合中
        Collection coll = new ArrayList<>();
        coll.add("DDD");
        coll.add("354");
        collection.addAll(coll);

        System.out.println(collection.size());
        System.out.println(collection);


        //clear():清空所有元素
        collection.clear();


        //isEmpty():判断当前集合是否有元素
        System.out.println(collection.isEmpty());


    }
}

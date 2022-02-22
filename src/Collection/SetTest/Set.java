package Collection.SetTest;

import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

/**
 *      |----Collection接口：单列集合，用来存储一个一个的对象
 *              |----Set接口：存储无序的、不可重复的数据--->类似于“集合”
 *                 |----HashSet:作为set接口的主要实现类：线程不安全，可以储存null值
 *                      |----LinkedHashSet:作为HashSet的子类，遍历其内部数据时，可以按添加时的顺序排序
 *                 |----TreeSet:可以按照添加对象的指定属性，进行排序
 */
public class Set {
    @Test
    //自然排序
    public void test1(){
        HashSet set = new HashSet();
        set.add(new Employee("zhangSan",43, new MyDate(2001,2,22)));
        set.add(new Employee("Lisi",53, new MyDate(2003,2,24)));
        set.add(new Employee("WangWu",24, new MyDate(2001,8,22)));
        set.add(new Employee("QianLiu",35, new MyDate(2008,5,22)));
        set.add(new Employee("ZhaoQi",43, new MyDate(2002,2,23)));

        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    @Test
    //按生日排
    public void test2(){
        TreeSet set = new TreeSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof Employee && o2 instanceof Employee) {
                    Employee e1 = (Employee) o1;
                    Employee e2 = (Employee) o2;

                    MyDate b1 = e1.getBirthday();
                    MyDate b2 = e2.getBirthday();

                    int minusYear = b1.getYear() - b2.getYear();
                    if (minusYear != 0) return minusYear;

                    int minusMonth = b1.getMonth() - b2.getMonth();
                    if (minusYear != 0) return minusMonth;

                    return b1.getDay() - b2.getDay();
                }
                throw new RuntimeException("传入的类型不一致！");
            }
        });

        set.add(new Employee("zhangSan",43, new MyDate(2001,2,22)));
        set.add(new Employee("Lisi",53, new MyDate(2003,2,24)));
        set.add(new Employee("WangWu",24, new MyDate(2001,8,22)));
        set.add(new Employee("QianLiu",35, new MyDate(2008,5,22)));
        set.add(new Employee("ZhaoQi",43, new MyDate(2002,2,23)));

        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

}




class MyDate{
    private int year;
    private int month;
    private int day;

    public MyDate() {
    }

    public MyDate( int year, int month, int day) {
        this.month = month;
        this.year = year;
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return "MyDate{" + "year=" + year + ",month=" + month + ",day=" + day + "}";
    }
}

class Employee{
    private String name;
    private int age;
    private MyDate birthday;

    public Employee() {
    }

    public Employee(String name, int age, MyDate birthday) {
        this.name = name;
        this.age = age;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Employee{" + "name='" + name + "\'" + ",age=" + age + ",birthday=" + birthday + '}';
    }


    public int compareTo(Object o){
        if(o instanceof Employee){
            Employee e = (Employee) o;
            return this.name.compareTo(e.name);
        }
        return 0;
    }

}
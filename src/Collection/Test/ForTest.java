package Collection.Test;

import org.junit.jupiter.api.Test;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class ForTest {
    @Test
    //增强for循环（for each）
    public void test1(){
        Collection collection = new ArrayList();
        collection.add(111);
        collection.add(new String("Curry"));
        collection.add(new Date());
        collection.add(false);

        //for(集合元素的类型 局部变量：集合对象)
        for(Object obj: collection)
            System.out.println(obj);
    }
}

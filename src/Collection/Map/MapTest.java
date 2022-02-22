package Collection.Map;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class MapTest {
    @Test
    public void test1(){
        Map map = new HashMap();
       // map = new Hashtable(); 作为古老的实现类；线程安全的，效率低；不能存储null的key和value
        map = new HashMap();// 作为Map的主要实现类；线程不安全的，效率高；存储null的key和value，健壮性好
        map.put(null,null);

    }
}

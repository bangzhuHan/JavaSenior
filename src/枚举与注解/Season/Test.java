package 枚举与注解.Season;

public class Test {
    public static void main(String[] args) {
        Season spring = Season.spring;
        System.out.println( spring);

        Season2 season2 = Season2.summer;
        System.out.println(season2.getSeasonName() + season2.getSeasonDesc());
        System.out.println(season2.getClass().getSuperclass());
    }
}




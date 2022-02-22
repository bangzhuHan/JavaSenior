package 枚举与注解.Season;

public class Season {
    //1，声明season对象的属性：private final修饰
    private final String seasonName;
    private final String seasonDesc;

    //2.私有化构造器，并给对象属性赋值
    public Season(String seasonName, String seasonDesc) {
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }

    //3.提供当前枚举类的多个对象：public static final
    public static final Season spring = new Season("春天","春暖花开");
    public static final Season summer = new Season("春天","夏日炎炎");
    public static final Season autumn = new Season("秋天","秋高气爽");
    public static final Season winter = new Season("春天","寒风刺骨");

    //4.获取当前季节的属性
    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }
    //提供tostring方法
    @Override
    public String toString() {
        return "Season{" +
                "seasonName='" + seasonName + '\'' +
                ", seasonDesc='" + seasonDesc + '\'' +
                '}';
    }
}


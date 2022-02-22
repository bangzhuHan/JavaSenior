package 枚举与注解.Season;

enum Season2 {
        spring("春天","春暖花开"),
        summer("夏天","夏日炎炎"),
        autumn("秋天","秋高气爽"),
        winter("冬天","寒风刺骨");

        private final String seasonName;
        private final String seasonDesc;

    Season2(String seasonName, String seasonDesc) {
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }


    //4.获取当前季节的属性
    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }
}

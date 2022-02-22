package Thread.Singleton;

class Singleton {
    private static Singleton instance = null;
    private Singleton(){}
    public static Singleton getInstance(){
        if(instance==null){
            synchronized(Singleton.class){
                if(instance == null){
                    instance=new Singleton();
                } } }
        return instance;
    } }
 class SingletonTest{
    public static void main(String[] args){
        Singleton s1=Singleton.getInstance();
        Singleton s2=Singleton.getInstance();
        System.out.println(s1==s2);
    } }

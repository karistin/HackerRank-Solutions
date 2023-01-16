package Advanced;

public class SingletonPattern {
    private SingletonPattern() {}
    public String str;
    private static SingletonPattern Instance;
    static SingletonPattern getSingleInstance() {
        if (Instance != null) {
            return Instance;
        }
        Instance = new SingletonPattern();
        return Instance;
    }
}
class Singleton {
    private volatile static Singleton instance;
    public static String str;
    private Singleton() {}

    static Singleton getSingleInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
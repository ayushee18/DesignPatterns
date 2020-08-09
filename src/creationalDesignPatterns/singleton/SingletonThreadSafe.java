package creationalDesignPatterns.singleton;

public class SingletonThreadSafe {

    private static SingletonThreadSafe obj;

    private SingletonThreadSafe() {}

    public static synchronized SingletonThreadSafe getInstance() {
        if(obj == null)
            obj = new SingletonThreadSafe();
        return obj;
    }

    public static void main(String[] args) {
        SingletonThreadSafe obj = SingletonThreadSafe.getInstance();
    }
}

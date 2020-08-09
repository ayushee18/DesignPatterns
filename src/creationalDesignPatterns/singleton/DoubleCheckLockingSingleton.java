package creationalDesignPatterns.singleton;

public class DoubleCheckLockingSingleton {

    private static DoubleCheckLockingSingleton obj;

    private DoubleCheckLockingSingleton() {}

    public static DoubleCheckLockingSingleton getInstance() {
        if(obj == null) {
            synchronized (DoubleCheckLockingSingleton.class) {
               if(obj == null)
                   obj = new DoubleCheckLockingSingleton();
            }
        }
        return obj;
    }

    public static void main(String[] args) {
        DoubleCheckLockingSingleton obj = DoubleCheckLockingSingleton.getInstance();
    }
}

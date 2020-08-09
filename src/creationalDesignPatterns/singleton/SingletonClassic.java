package creationalDesignPatterns.singleton;

//The singleton pattern is a design pattern that restricts the instantiation of a class to one object.
public class SingletonClassic {

    private static SingletonClassic obj;

    private SingletonClassic(){}

    public static SingletonClassic getInstance() {
        if(obj == null)
            obj = new SingletonClassic();
        return obj;
    }

    public static void main(String[] args) {
        SingletonClassic obj = SingletonClassic.getInstance();
    }
}

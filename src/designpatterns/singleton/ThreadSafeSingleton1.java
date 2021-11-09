package designpatterns.singleton;

public class ThreadSafeSingleton1 {
    private static ThreadSafeSingleton1 obj;

    private ThreadSafeSingleton1(){}

    public static synchronized ThreadSafeSingleton1 getInstance(){
        if(obj == null) obj = new ThreadSafeSingleton1();
        return obj;
    }
}

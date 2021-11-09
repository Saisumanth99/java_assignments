package designpatterns.singleton;

public class ThreadSafeSingleton2 {
    private static ThreadSafeSingleton2 obj;

    private ThreadSafeSingleton2(){}

    public static ThreadSafeSingleton2 getInstance(){
        if(obj == null) {
            synchronized (ThreadSafeSingleton2.class) {
                if (obj == null) obj = new ThreadSafeSingleton2();

            }
        }
        return obj;
    }
}

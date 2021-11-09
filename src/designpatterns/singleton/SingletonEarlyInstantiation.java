package designpatterns.singleton;

public class SingletonEarlyInstantiation {
    private static SingletonEarlyInstantiation obj = new SingletonEarlyInstantiation();

    private SingletonEarlyInstantiation(){}

    public static SingletonEarlyInstantiation getInstance(){
        return obj;
    }
}

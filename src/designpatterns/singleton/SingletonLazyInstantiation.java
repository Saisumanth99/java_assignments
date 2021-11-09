package designpatterns.singleton;

public class SingletonLazyInstantiation {
    private static SingletonLazyInstantiation obj;

    private SingletonLazyInstantiation(){}

    public static SingletonLazyInstantiation getInstance(){
        if(obj == null) obj = new SingletonLazyInstantiation();
        return obj;
    }
}

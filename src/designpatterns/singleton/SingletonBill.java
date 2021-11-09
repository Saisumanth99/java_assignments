package designpatterns.singleton;


public class SingletonBill {
    private SingletonBill(){};

    private static class Singleton{
        private static final Singleton obj = new Singleton();
    }

    public static Singleton getInstance(){
        return Singleton.obj;
    }
}

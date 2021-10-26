package sumanth.assignment.singleton;

public class Singleton {
    String str;

    public static Singleton setStr(String strval){

        // this.str = strval;
        // class variables cannot be used in a static method as static methods are loaded when a class is loaded
        //whereas instance variables are instantiated when a object is created, hence we cannot access instance variables
        //in static methods directly, but can be accesed through an object.

        return new Singleton();
    }
    public void display(){
        System.out.println(str);
    }
}

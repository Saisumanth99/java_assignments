package accesscontrol.task3;

public class Extension extends Concrete implements Interface4 {
    @Override
    public void newMethod() {
        System.out.println("This is interface 4 new method");
    }

    @Override
    public void i1m1() {
        System.out.println("This is interface 1 method 1");
    }

    @Override
    public void i1m2() {
        System.out.println("This is interface 1 method 2");
    }

    @Override
    public void i2m1() {
        System.out.println("This is interface 2 method 1");
    }

    @Override
    public void i2m2() {
        System.out.println("This is interface 2 method 2");
    }

    @Override
    public void i3m1() {
        System.out.println("This is interface 3 method 1");
    }

    @Override
    public void i3m2() {
        System.out.println("This is interface 3 method 2");
    }

    public void method1(Interface1 i){
        i.i1m1();
    }

    public void method2(Interface2 i){
        i.i2m1();
    }

    public void method3(Interface3 i){
        i.i3m1();
    }

    public void method4(Interface4 i){
        i.newMethod();
    }


}

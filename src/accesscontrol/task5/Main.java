package accesscontrol.task5;

public class Main {
    public static void main(String[] args) {
        SecondClass.SecondInnerClass obj = new SecondClass().new SecondInnerClass("sumanth");
        System.out.println(obj.getClass().toString());
    }
}

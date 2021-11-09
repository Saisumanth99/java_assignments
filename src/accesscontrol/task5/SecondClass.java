package accesscontrol.task5;

public class SecondClass extends FirstClass {
    class SecondInnerClass extends FirstClass.FirstInnerClass {

        SecondInnerClass(String str) {
            super(str);

        }
    }

}

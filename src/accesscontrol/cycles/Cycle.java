package accesscontrol.cycles;

public class Cycle {



    public static void main(String[] args) {

        Cycle obj;
        obj = new Bicycle();
        // obj.balance();         //cannot find method balance in Cyle
        obj = new Tricycle();
        // obj.balance();           //cannot find method balance in Cyle
        obj = new Unicycle();
        //obj.balance();         //cannot find method balance in Cyle

        Unicycle unicycle = new Unicycle();
        unicycle.balance();

        Tricycle tricycle = new Tricycle();
        // tricycle.balance();    //cannot find method balance in tricycle;

        Bicycle bicycle = new Bicycle();
        bicycle.balance();

    }
}

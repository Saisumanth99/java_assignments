package accesscontrol.task4;

public class CycleFactory {
    public Cycle buildCycle(int i){
        if(i == 1) return new Unicycle();
        else if(i == 2) return new Bicycle();
        else if(i == 3) return new Tricycle();

        return null;
    }
}

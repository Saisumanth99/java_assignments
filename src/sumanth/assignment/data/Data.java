package sumanth.assignment.data;

public class Data {
    int var1; char var2;

    public void display(){
        System.out.println("var 1 : "+var1+" var 2 : "+var2);
    }

    public void displayLocal(){
        int var1; char var2;
        //System.out.println("var 1 : "+var1+" var 2 : "+var2);
        //in java local variables doesnt have default values, so they must be initialized before usage;
    }
}

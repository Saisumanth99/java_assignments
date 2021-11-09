package accesscontrol.rodents;

public abstract class Rodent {
    Rodent(){
        System.out.println("I am a rodent");
    }
    public void numberOfLegs(){
        System.out.println("rodent has two legs");
    }
    public abstract void bodyCharacteristics();

    public static void main(String[] args) {

        Rodent[] arr = new Rodent[]{new Gerbil(), new Mouse(), new Hamster()};

        for(Rodent r : arr){
            r.numberOfLegs();
            r.bodyCharacteristics();
        }

    }


}

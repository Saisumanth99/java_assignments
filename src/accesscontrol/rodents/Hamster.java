package accesscontrol.rodents;

public class Hamster extends Rodent {
    Hamster(){
        System.out.println("I am a hamster");
    }

    @Override
    public void bodyCharacteristics() {
        System.out.println("I have a short tail and and lot of fur, I am round in shape and has larger ears than gerbil");
    }

}

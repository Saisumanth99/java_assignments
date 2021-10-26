package accesscontrol.rodents;

public class Gerbil extends Rodent {


    Gerbil(){
        System.out.println("I am a gerbil");
    }

    @Override
    public void bodyCharacteristics() {
        System.out.println("I have long tail and small ears, I can stand on my legs and I live in burrows");
    }
}

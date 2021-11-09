package accesscontrol.rodents;

public class Mouse extends Rodent {

    Mouse(){
        System.out.println("I am a mouse");
    }

    @Override
    public void bodyCharacteristics() {
        System.out.println("I have long tail and large ears, i dont stand on my legs but i can run very fast than other two");
    }


}

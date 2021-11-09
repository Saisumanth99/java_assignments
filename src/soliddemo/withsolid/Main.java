package soliddemo.withsolid;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Player player = new Player();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your level");
        int level = scanner.nextInt();
        
        System.out.println("Select your player");
        for(int i=0; i<Configuration.playerCount; i++) System.out.println((i+1)+") "+Configuration.playerNames[i]);
        int index = scanner.nextInt();
        if(level < Configuration.levelThreshold){
            if(index==1)
                player.setAttackType(new LandAttack());
            else if(index == 2)
                player.setAttackType(new AerialAttack());
        } else {
            if(index==1)
                player.setAttackType(new AdvancedLandAttack());
            else if(index == 2)
                player.setAttackType(new AdvancedAerialAttack());
        }

        System.out.println("enter 1 to attack");
        if(scanner.nextInt() == 1) player.attack();
        scanner.close();


    }
}

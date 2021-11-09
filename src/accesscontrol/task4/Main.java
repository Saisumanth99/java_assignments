package accesscontrol.task4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int choice;
        Scanner scanner = new Scanner(System.in);
        Cycle cycle;
        CycleFactory cycleFactory = new CycleFactory();

        System.out.println("choose the cycle to build 1.) Unicycle 2.) Bicycle 3.) Tricycle 4.) Quit\n");
        while(true){
            System.out.println("Enter choice : ");
            choice = scanner.nextInt();
            if(choice >= 4 || choice<=0) break;
            cycle = cycleFactory.buildCycle(choice);
            cycle.info();
        }
    }
}

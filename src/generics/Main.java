package generics;

import java.util.Scanner;

public class Main {


    public static void main(String args[]){

        SList sl = new SList();
        SListIterator iterator = sl.iterator();

        System.out.println("Select\n1)insert");
        System.out.println("2)delete last");
        System.out.println("3)display");
        System.out.println("4)exit\n");
        while(true){


            System.out.println("\nEnter choice : ");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();


            if(choice == 1){
                System.out.println("enter data to insert : ");
                iterator.insert(new Node<String>(scanner.next(), null));
            }
            else if(choice == 2){
                iterator.deleteLast();
            }
            else if(choice == 3){
                iterator.display();
            }
            else if(choice == 4){
                break;
            }
            else{
                System.out.println("Invalid respone!");
            }
        }

    }
}

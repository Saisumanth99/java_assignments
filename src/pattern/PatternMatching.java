package pattern;

import java.util.Scanner;

public class PatternMatching {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String str1 = scanner.nextLine();
        //String regex = "/[A-Z]([a-zA-Z,;\\s])*[.]\\n/";
        String regex = "[A-Z][\\s\\S]*?[.!?](?:\\n\\n|\\z)";


        if (str1.matches(regex)){
            System.out.println("Conditions are satisfied");
        } else {
            System.out.println("Conditions are NOT satisfied");
        }


    }
}

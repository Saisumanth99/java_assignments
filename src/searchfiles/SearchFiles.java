package searchfiles;

import java.io.File;
import java.nio.file.Path;
import java.util.*;

public class SearchFiles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String basePath = Path.of("").toAbsolutePath().toString();

        File base = new File(basePath, "src/searchfiles/home");
        FileScanner fileScanner = new FileScanner();

        while(true) {

            System.out.println("enter the regex value or exit to quit : ");
            String regex = scanner.nextLine();

            if(regex.equals("exit")){
                break;
            }
            List<String> matchingFiles = fileScanner.scanFilesMatchingRegex(base, regex);
            for(String filename : matchingFiles){
                System.out.println(filename);
            }
        }

    }
}

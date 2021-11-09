package searchfiles;

import java.io.File;
import java.util.*;
import java.util.regex.Pattern;

public class FileScanner {
    String regex = "";
    int count = 0;


    List<String> scanFilesMatchingRegex(File base, String regex){
        this.regex = regex;
        List<String> matchingFiles = new ArrayList<>();

        for(File file : Objects.requireNonNull(base.listFiles())){

            if(file.isDirectory()){
               matchingFiles.addAll(scanFilesMatchingRegex(file, regex));
            } else if(file.isFile() && Pattern.matches(regex, file.getName())) {
                count++;
                matchingFiles.add(file.getAbsolutePath());
            }
        }

        return matchingFiles;

    }
}

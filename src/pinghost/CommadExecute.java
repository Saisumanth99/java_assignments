package pinghost;

import java.io.*;

public class CommadExecute {
    public String executeCommand(String command) throws Exception{

        Process process = Runtime.getRuntime().exec(command);
        BufferedReader r = new BufferedReader(new InputStreamReader(process.getInputStream()));
        StringBuilder stringBuilder = new StringBuilder(" ");
        String line;
        while (true) {
            line = r.readLine();
            if (line == null) { break; }
            stringBuilder.append(line).append("\n");
        }
        return stringBuilder.toString();
    }
}

package pinghost;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CommandLineApproach {

   public int[] pingUrl(String url, int count) throws Exception {
        CommadExecute commadExecute = new CommadExecute();
        String command = "ping "+url+" -n "+count;
        String output = commadExecute.executeCommand(command);
        System.out.println(output);

       String[] allTimeStrings = new String[count];
       int[] allTimeValues = new int[count];
       int i=0;

       Matcher matcher = Pattern.compile("time=[0-9]*ms").matcher(output);
       while (matcher.find()) { allTimeStrings[i] = matcher.group(); i++;}

       i=0;
       for(String val : allTimeStrings){
           allTimeValues[i] = Integer.parseInt(val.substring(val.indexOf("=")+1, val.indexOf("s")-1)); i++;
       }

       return allTimeValues;


    }

    public int getMedian(int[] list){

        Arrays.sort(list);
        return list[(list.length/2)];

    }


    public static void main(String[] args) {
        CommandLineApproach commandLineApproach = new CommandLineApproach();

        try{
            System.out.println("median is "+commandLineApproach.getMedian(commandLineApproach.pingUrl("www.javatpoint.com", 5))+" ms");
        } catch (Exception e){
            System.out.println(e);
        }

    }
}

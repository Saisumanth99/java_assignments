package pinghost;

import java.net.InetAddress;
import java.util.Arrays;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class PingTimeMedian {
    public static void main(String[] args) {

        String url = "www.javatpoint.com";


        System.out.println("enter count : ");
        int count = new Scanner(System.in).nextInt();
        long arr[] = new long[count];


        try {
            InetAddress inet = InetAddress.getByName(url);

            long start = 0, end=0;

            while(count>0) {
                start = System.nanoTime();
                if (inet.isReachable(5000)) {
                    end = System.nanoTime();

                    System.out.println("start "+start+" end "+end);
                    arr[--count] = end-start;


                } else {
                    System.out.println("Url is not reachable");
                    break;
                }
            }

        } catch (Exception e) {
            System.out.println(e);
        }
        Arrays.sort(arr);
        long median = arr[(int)(arr.length/2)];
        System.out.println("\nMedian time in ns is : "+median);


    }
}

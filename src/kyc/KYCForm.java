package kyc;

import java.text.SimpleDateFormat;
import java.util.*;

public class KYCForm {

    public void printRange(String signDateStr, String nowDateStr) throws Exception{

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");

        Date signDate = simpleDateFormat.parse(signDateStr);
        Date nowDate = simpleDateFormat.parse(nowDateStr);

        Calendar signDateCalender = Calendar.getInstance();
        signDateCalender.setTime(signDate);

        Calendar nowDateCalender = Calendar.getInstance();
        nowDateCalender.setTime(nowDate);

        Calendar tempCalendar = Calendar.getInstance();
        tempCalendar.setTime(signDate);

        if(signDateCalender.after(nowDateCalender)){
            System.out.println("No range"); return;
        } else {
            tempCalendar.add(Calendar.YEAR, (nowDateCalender.get(Calendar.YEAR) - signDateCalender.get(Calendar.YEAR)));
            tempCalendar.add(Calendar.DAY_OF_MONTH, -30);
            System.out.print(simpleDateFormat.format(tempCalendar.getTime())+" ");

            tempCalendar.add(Calendar.DAY_OF_MONTH, 60);
            if(tempCalendar.after(nowDateCalender)){
                System.out.println(simpleDateFormat.format(nowDateCalender.getTime()));
            } else {
                System.out.println(simpleDateFormat.format(tempCalendar.getTime()));
            }

        }


    }


    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = scanner.nextInt();
        KYCForm obj = new KYCForm();

        System.out.println("Enter "+n+" dates : ");
        for(int i=0; i<n; i++){
            String signDate = scanner.next();
            String nowDate = scanner.next();

            obj.printRange(signDate, nowDate);

        }
    }
}

package Datetime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Vddate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String start = scanner .nextLine();
        String end = scanner.nextLine();

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date startDate = simpleDateFormat.parse(start);
            Date endDate = simpleDateFormat.parse(end);

            long startValue = startDate.getTime();
            long endValue = endDate.getTime();
            long tmp = Math.abs(startValue-endValue);
            long result = tmp/(24*60*60*1000);
            System.out.println("So ngay chenh lech :"+ result);


        } catch (ParseException e) {
            e.printStackTrace();
        }



    }
}

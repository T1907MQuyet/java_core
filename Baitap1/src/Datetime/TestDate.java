package Datetime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TestDate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String start = scanner.nextLine();
        String end = scanner.nextLine();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");


        try {
            Date dateStart = simpleDateFormat.parse(start);
            Date dateEnd = simpleDateFormat.parse(end);

            long valueStart = dateStart.getTime();
            long valueEnd = dateEnd.getTime();

            long tmp = Math.abs(valueEnd- valueStart);

            long result = tmp/(24*60*60*1000);
            System.out.println("So ngay chenh lech :"+ result);
        } catch (ParseException e) {
            e.printStackTrace();
        }






    }
}

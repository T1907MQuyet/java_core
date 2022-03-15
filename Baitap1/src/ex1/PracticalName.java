package ex1;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.util.Scanner;

public class PracticalName {
    public static void main(String[] args) {
        int a,b,c;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào a:");
        a = scanner.nextInt();
        System.out.println("Nhập vào b:");
        b = scanner.nextInt();
        System.out.println("Nhập vào số c:");
        c = scanner.nextInt();

        if (a<=0&&b<=0 && c<=0){
            System.out.println("No");
        }else


        if (a+b>c && a+c>b && b+c>a){
            System.out.println("Có thể tạo thành tam giác");

        }else {
            System.out.println("NO");
        }
    }
}

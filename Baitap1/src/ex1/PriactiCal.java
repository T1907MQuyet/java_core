package ex1;

import java.util.Scanner;

public class PriactiCal {
    public static void main(String[] args) {
        int a;
        Scanner scanner = new Scanner(System.in);

        a = scanner.nextInt();

        if (a%2== 0){
            System.out.println("A chia là số chẵn");

        }else {
            System.out.println("A là số lẻ");
        }
    }
}

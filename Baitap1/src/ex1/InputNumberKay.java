package ex1;

import java.util.Scanner;

public class InputNumberKay {
    public static void main(String[] args) {
        int a,b;
        Scanner scanner = new Scanner(System.in);

        a = scanner.nextInt();
        b = scanner.nextInt();

        if (a>b){
            System.out.println("Số a lớn hơn số b");
        }else if (a==b){
            System.out.println("Số a = b");

        }else {
            System.out.println("Số a nhỏ hơn b");
        }

    }
}

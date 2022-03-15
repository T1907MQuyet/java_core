package student;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Student[] students = new  Student[10];
        students[0] = getStudentInfo();

        System.out.println(students[0]);
        students[0].doHomeWork("Làm bài tập c");
        students[0].payFee();

    }
    public  static  Student getStudentInfo(){
        Student s = null;
        String id,fullname,address,email,phone;
        float free;
        Scanner sc = new Scanner(System.in);
        System.out.println("ID:");
        id = sc.nextLine();
        System.out.println("Full Name:");
        fullname = sc.nextLine();
        System.out.println("Address:");
        address = sc.nextLine();
        System.out.println("Email");
        email = sc.nextLine();
        System.out.println("Phone:");
        phone = sc.nextLine();
        System.out.println("Fee3");
        free = sc.nextFloat();
        s = new Student(id,fullname,email,address,phone,free);


        return s;
    }
}

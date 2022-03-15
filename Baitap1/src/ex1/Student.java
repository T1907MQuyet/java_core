package ex1;

import java.util.Scanner;

public class Student extends Person {
    private   String rollNo;
    private  String mark;
    private  String email;

    public Student(int i, String viet, String haNoi) {
    }

    public String getRollNo() {
        return rollNo;
    }

    public boolean setRollNo(String rollNo) {
        if (rollNo != null && rollNo .length() == 8){
            this.rollNo = rollNo;
            return  true;
        }else {
            System.out.println( "Nhạp ma sinh vien:");
            return false;
        }

    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public void inputInfor() {
        super.inputInfor();
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap ma sinh vien");
        while (true){
            String rollNoInput = input.nextLine();
            boolean check = setRollNo(rollNoInput);
            if ( check){
                break;
            }
        }
    }
}

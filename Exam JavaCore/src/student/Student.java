package student;

public class Student {
    private String id;
    private String fullname;
    private String email;
    private  String address ;
    private  String phoneNum;
    private float fee;


    public Student() {
    }

    public Student(String id, String fullname, String email, String address, String phoneNum, float fee) {
        this.id = id;
        this.fullname = fullname;
        this.email = email;
        this.address = address;
        this.phoneNum = phoneNum;
        this.fee = fee;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public float getFee() {
        return fee;
    }

    public void setFee(float fee) {
        this.fee = fee;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", fullname='" + fullname + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", phoneNum='" + phoneNum + '\'' +
                ", fee=" + fee +
                '}';
    }
    void study(String subject){
        System.out.println(this.fullname+"is studying"+ subject);
    }
    void doExam(String subject){
        System.out.println(this.fullname+ "doing"+subject+ "exam");

    }
    void  payFee(){
        System.out.println("Fee of"+this.fullname+ "is"+ this.fee);

    }
    void doHomeWork(String subject){
        System.out.println(this.fullname+"is doing"+ subject+ "homework");
    }
}

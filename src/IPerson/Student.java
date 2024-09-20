
package IPerson;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class Student extends Person{
    private float GPA;
    private String  major;

    public Student() {
    }

    public Student(float GPA, String major, String id, String fullName, Date dateOfBirth) {
        super(id, fullName, dateOfBirth);
        this.GPA = GPA;
        this.major = major;
    }

    public float getGPA() {
        return GPA;
    }

    public void setGPA(float GPA) {
        this.GPA = GPA;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
    public void addStudent(){
        Scanner sc=new Scanner (System.in);
        System.out.println("ID :");
        String id=sc.nextLine();
        this.setId(id);
        System.out.println("FullName :");
        String fullName=sc.nextLine();
        this.setFullName(fullName);
        System.out.println("GPA :");
        float GPA=Float.parseFloat(sc.nextLine());
        this.setGPA(GPA);
        System.out.println("Major :");
        String major=sc.nextLine();
        this.setMajor(major);
        System.out.println("date of birth :");
        String ngaySinh=sc.nextLine();
        SimpleDateFormat sft=new SimpleDateFormat("dd/MM/yyyy");
        try{
            Date dateOfBirth=sft.parse(ngaySinh);
            this.setDateOfBirth(dateOfBirth);
        }catch(Exception e){
            System.out.println("Wrong fomat !");
        }
    }
    public void displayInfo(){
        System.out.println("hien thi thong tin sinh vien :");
        System.out.println("ID :"+this.getId());
        System.out.println("FullName :"+this.getFullName());
        System.out.println("GPA :"+this.getGPA());
        SimpleDateFormat sfg=new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("date of birth :"+sfg.format(dateOfBirth));
        System.out.println("Major :"+this.getMajor());
    }
        
}
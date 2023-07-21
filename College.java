import javax.swing.*;
import java.util.Scanner;
class Person
{
    String FirstName;
    String  LastName;
    String StreetAddress;
    int ZipCode;
    int PhoneNo;
    public void Box()
    {
        //System.out.println("  PERSON DETAILS  \n\n");
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your first name");
        this.FirstName=sc.nextLine();
        System.out.println("enter your last name");
        this.LastName=sc.nextLine();
        System.out.println("enter your street address");
        this.StreetAddress=sc.nextLine();
        System.out.println("enter your zip code");
        this.ZipCode=sc.nextInt();
        System.out.println("enter your phone number");
        this.PhoneNo=sc.nextInt();
    }
    void display()
    {
        System.out.println("NAME: "+FirstName+" "+LastName);
        System.out.println("STREET ADDRESS: "+StreetAddress);
        System.out.println("ZIPCODE: "+ZipCode);
        System.out.println("PHONE NUMBER: "+PhoneNo);
    }
}
class CollegeEmployee extends Person
{
    int SocialSecurityNo;
    int AnnualSalary;
    String DeptName;
    public void Employee() {
        System.out.println("  COLLEGE EMPLOYEE DETAILS  \n\n");
        super.Box();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the social security number: ");
        SocialSecurityNo = sc.nextInt();
        System.out.println("enter the annual salary: ");
        AnnualSalary = sc.nextInt();
//        sc.nextLine();
        System.out.println("enter the department name: ");
//        DeptName = sc.nextLine();
        sc.nextLine();
    }
    void displayy()
    {
        super.display();
        System.out.println("SOCIAL SECURITY NUMBER: "+SocialSecurityNo);
        System.out.println("ANNUAL SALARY: "+AnnualSalary);
        System.out.println("DEPARTMENT NAME: "+DeptName);

    }


}
class Faculty extends CollegeEmployee
{
    boolean tenured;
    public void Facultyy()
    {
        System.out.println("   FACULTY DETAILS   \n\n");
        super.Box();
        Scanner sc=new Scanner(System.in);
        System.out.println("tenured or not(true/false)? ");
        tenured=sc.nextBoolean();
    }
    void displayyy()
    {
        super.display();
        if (tenured) {
            System.out.println("TENURED: yes tenured");
        } else {
            System.out.println("TENURED: not tenured");
        }

    }

}
class Student extends Person
{
    String FieldOfStudy;
    int GradeAvg;
   public void Stu(){
       System.out.println("  STUDENT DETAILS  \n\n");
       super.Box();
       Scanner sc=new Scanner(System.in);
        System.out.println("enter your field of study: ");
        FieldOfStudy=sc.nextLine();
        System.out.println("enter your average garde: ");
        GradeAvg=sc.nextInt();

    }
    void displayyyy()
    {
        super.display();
        System.out.println("Field of study: "+FieldOfStudy);
        System.out.println("Average Grade: "+GradeAvg);
    }

}

public class College
{
    public static void main(String[]args)
    {
     Person p=new Person();
     p.Box();
     p.display();
     CollegeEmployee c=new CollegeEmployee();
     c.Employee();
     c.displayy();
     Faculty f=new Faculty();
     f.Facultyy();
     f.displayyy();
     Student s=new Student();
     s.Stu();
     s.displayyyy();
    }
}

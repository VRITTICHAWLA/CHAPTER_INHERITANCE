import java.util.Scanner;
class CollegeCourse
{
    String Dept;
    int CourseNumber;
    int Credits;
    int Fee;
    CollegeCourse(String Dept,int CourseNumber,int Credits)
    {
        this.Dept=Dept;
        this.CourseNumber=CourseNumber;
        this.Credits=Credits;
       int FeePerHour= 120;
       Fee=Credits*FeePerHour;
    }
    public void display()
    {
        System.out.println("department name is: "+Dept);
        System.out.println("course number is: "+CourseNumber);
        System.out.println("Credit of course is: "+Credits);
        System.out.println("fee for course is: "+Fee);

    }


}
class LabCourse extends CollegeCourse {
    LabCourse(String Dept, int CourseNumber, int Credits) {

        super(Dept, CourseNumber, Credits);
    }
        public void display()
        {
//            int FeePerHour=120;
            if (Dept.equals("PHY") || Dept.equals("CHM") || Dept.equals("CIS") || Dept.equals("BIO"))
            {
                Fee+=50;
            }
            super.display();
        }

    }

    public class UseCourse {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter your department");
            String dep = sc.nextLine();
            System.out.println("enter the course number");
            int n = sc.nextInt();
            System.out.println("enter the credit for the course");
            int c = sc.nextInt();

            LabCourse l = new LabCourse(dep, n, c);
            l.display();
        }
    }


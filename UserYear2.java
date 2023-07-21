class yearr{
    int noOfDays;
    int day;
    int month;
    yearr()
    {
        this.noOfDays=365;
    }
    public void getNoOfDays()
    {
        System.out.println("no of days in a year are: "+this.noOfDays);
    }
    void daysElapsed(int d,int m)//method overriding
    {
        day=d;
        month=m;
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int days=0;
        for(int i=1;i<month;i++)
        {
            days+=daysInMonth[i-1];
        }
        days += (day-1);
        System.out.println("days elapsed are: "+days);
    }


}
class leapYearr extends yearr{
    int day;
    int month;
    public void getNoOfDays() {

        int noOfDays = 366;
        System.out.println("no of days in a leap year are: "+noOfDays);
    }
    void daysElapsed(int d,int m)
    {
        day=d;
        month=m;
        int[] daysInMonth = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int days=0;
        for(int i=1;i<month;i++)
        {
            days+=daysInMonth[i-1];
        }
        days+=(day-1);
       System.out.println("days elapsed are: "+days);
    }
}
public class UserYear2 {
    public static void main(String[]args)
    {
     yearr y=new yearr();
     y.getNoOfDays();
     y.daysElapsed(3,3);
     leapYearr l=new leapYearr();
     l.getNoOfDays();
     l.daysElapsed(3,3);
    }
}

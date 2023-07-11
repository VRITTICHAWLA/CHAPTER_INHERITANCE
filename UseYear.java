class Year{
    int noOfDays;
    Year()
    {
        this.noOfDays=365;
    }
    public void getNoOfDays()
    {
       System.out.println("no of days in a year are: "+this.noOfDays);
    }

}
class LeapYear extends Year{
    public void getNoOfDays() {
        int noOfDays = 366;
        System.out.println("no of days in a leap year are: "+noOfDays);
    }
}

public class UseYear {

    public static void main(String[]args)
    {
     Year y=new Year();
     y.getNoOfDays();//class with diff name,samemethod name and paramter
     LeapYear l=new LeapYear();
     l.getNoOfDays();//method overriding

    }
}

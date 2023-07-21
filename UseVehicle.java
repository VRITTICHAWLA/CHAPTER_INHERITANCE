class Vehicle
{
    private int NoOfWheels;
    private int NoOfMiles;
    Vehicle(int w,int m)
    {
        this.NoOfWheels=w;
        this.NoOfMiles=m;
    }
    public String  toString()
    {
        return "no of wheels are: "+NoOfWheels+", the average no of miles per gallon are: "+NoOfMiles;
    }

}
class MotorCycle extends Vehicle
{
  MotorCycle(int m)
{
    super(2,m);
}
}
class Car extends Vehicle
{
    Car(int m)
    {
        super(4,m);
    }
}


public class UseVehicle {
    public static void main(String[]args)
    {
    Car c=new Car(440);
    MotorCycle m=new MotorCycle(250);
    System.out.println("CAR INFO: ");
    System.out.println(c.toString());
    System.out.println("MOTORCYCLE INFO: ");
   System.out.println( m.toString())
   ;

    }
}

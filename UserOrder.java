
class Order
{
    String customerName;
    int customerNumber;
    int quantityOrdered;
    int unitPrice;
    //int totalPrice;
    public void setcustomername(String c){
        customerName=c;
    }
    public void setcustomerNumber(int n){
        customerNumber=n;

    }
    public void setquantity(int q){
        quantityOrdered=q;

    }
    public void setunitprice(int u){
        unitPrice=u;

    }
    public String getcustomerName(){
        return customerName;

    }


    public int getcustomerNumber(){
        return customerNumber;

    }
    public int getquantity(){
       return quantityOrdered;

    }
    public int getunitprice(){
        return unitPrice;

    }
    public Double computeprice()
    {
        return  (double)unitPrice*quantityOrdered;

    }
    void show()
    {
        System.out.println("the customer name is: "+getcustomerName());
        System.out.println("the customer number is: "+getcustomerNumber());
        System.out.println("quantity ordered is: "+getquantity());
        System.out.println("the unit price is: "+getunitprice());
        System.out.println("the total price is: "+computeprice());

    }



}
class ShippedOder extends Order{
    public void priceAftershipping()
    {
        double ShippingCharges=50;
        double price=computeprice()+ShippingCharges+4;
        System.out.println("the total price including shipping charges is: "+price);
    }
}
public class UserOrder {
    public static void main(String[]args)
    {
      ShippedOder s= new ShippedOder();
      s.setcustomername("vritti");
      s.setcustomerNumber(701536);
      s.setquantity(3);
      s.setunitprice(170);
      s.show();
      s.priceAftershipping();


    }
}

/*
Amon Guinan
Java 2
April 2019
 */

public class Ticket
{
    private double price;
    private char service;

    public Ticket( double newPrice, char newService )
    {
        setPrice( newPrice );
//        setService( newService );
    }

    public void setPrice(double price) {
        if(price>= 0)
        {
            this.price = price;
        }
        else System.exit(0);
    }
//     public void setService(char price){
//        if((service = 'A') || (service = 'B'){
//            this.service = service;
//        }
//     }

     public double getPrice(){return price;}
     public double getService(){return service;}
}
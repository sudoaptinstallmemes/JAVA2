

public class AUTOCLIENT {
    public static void main(String [] args)
    {

AUTOMAIN car1 = new AUTOMAIN();
AUTOMAIN car2 = new AUTOMAIN();

//Edit car details here.
car1.Car("FORD", 2000);
car2.Car("TOYOTA", 1000);

System.out.println();
System.out.println(car1.getCarModel()+", "+car1.getMileage()+" miles.");
System.out.println(car2.getCarModel()+", "+car2.getMileage()+" miles.");

if((car1.getCarModel().equals(car2.getCarModel())) && (car1.getMileage() == (car2.getMileage())))
{
    System.err.print("Its the same car.");
}
else
{
    System.err.println("They are not the same cars.");
}
    }
}

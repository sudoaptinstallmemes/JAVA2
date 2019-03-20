

public class TV_CLIENT {
    public static void main(String [] args)
    {

        TelevisionChannel car1 = new TelevisionChannel();

//Edit car details here.
        car1.initiate("MEDIA", 12,true);
        System.out.println();
        System.out.println(car1.getChannel()+", #"+car1.getNumber()+".");
        System.out.println("Is channel cable? >"+car1.get_isCable());






        //        if((car1.getCarModel().equals(car2.getCarModel())) && (car1.getMileage() == (car2.getMileage())))
//        {
//            System.err.print("Its the same car.");
//        }
//        else
//        {
//            System.err.println("They are not the same cars.");
//        }
    }
}

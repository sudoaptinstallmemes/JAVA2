public class AUTOCLIENT {
    public static void main(String [] args)
    {

        //Airport Code
AirportClass arprtclss = new AirportClass();
arprtclss.Airport();
arprtclss.Airport("DFW",8);
System.out.println(arprtclss.getAirportCode());
System.out.println(arprtclss.getGates());




    }
}

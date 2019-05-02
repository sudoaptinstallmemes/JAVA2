public class Venue {
    private String name;
    private int capcity;

    public Venue(String myName, int myCapacity)
    {
        name = myName;
        capcity = myCapacity;
    }
//    public abstract double getRevenue();
}

 class Stadium extends Venue
{
private final int $_PREMIUM_SEAT = 200;
private final int $_GERNERAL_SEAT = 75;
private final int MAX_PREMIUM_SEATS;
private final int MAX_GENERAL_SEATS;
private int premiumSeatsSold, generalSeatsSold;

public Stadium(String name, int capacity, int premiumSeats)
{
    super(name, capacity);
    MAX_PREMIUM_SEATS = premiumSeats;
    MAX_GENERAL_SEATS = capacity - premiumSeats;
}
public double getRevenue()
{
    double revenue;
    revenue = (premiumSeatsSold*$_PREMIUM_SEAT)+(generalSeatsSold*$_GERNERAL_SEAT);
    return revenue;
}
}

class Club extends Venue
{

    private String genre;
    private final double $_SEAT;
    private int ticketsSold;

    public Club(String name, int capacity, String musicType, double ticketPrice)
    {
        super(name, capacity);
        $_SEAT = ticketPrice;
        genre = musicType;
    }
    public double getRevenue()
    {
        double revenue;
        revenue = ($_SEAT*ticketsSold);
        return revenue;
    }
}

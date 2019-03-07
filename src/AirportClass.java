public class AirportClass{
    String airportCode;
    int gates;
    public void Airport()
    {
        airportCode = "";
    }
    public void Airport(String startAirportCode, int startGates)
    {
        setAirportCode(startAirportCode);
        setGates(startGates);
    }

    public String getAirportCode()
    {
        return airportCode;
    }

    public int getGates()
    {
        return gates;
    }

    public void setAirportCode(String newAirportCode)
    {
        airportCode = newAirportCode;

    }

    public void setGates(int newGates)
    {
        if (newGates >= 0)
        {
            gates = newGates;
        }
    }

}

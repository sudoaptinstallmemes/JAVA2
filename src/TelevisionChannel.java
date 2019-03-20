public class TelevisionChannel {
    private String channel;
    private int number;
    private boolean isCable;

    public void initiate (String channel, int number, boolean isCable)
    {
        setChannel(channel);
        setNumber(number);
        set_isCable(isCable);
    }
    public String getChannel()
    {
        return channel;
    }

    public int getNumber()
    {
        return number;
    }

    public boolean get_isCable()
    {
        return isCable;
    }


    public void setChannel(String newChannel)
    {
        channel = newChannel;

    }

    public void set_isCable(boolean new_isCable) {
        isCable = new_isCable;
    }

    public void setNumber(int newNumber)
    {
        if (newNumber >= 0)
        {
            number = newNumber;
        }
    }

}



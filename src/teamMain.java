public class teamMain {

    private String name;

    public void INPUT(String tempName)
    {
        setName(tempName);
    }
    public String getName() {return name;}


    public void setName(String name) {
        this.name = name;
    }

    public boolean equal(String name)
    {
        if(name.equals("a Fake Team"))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

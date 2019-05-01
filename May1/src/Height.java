import java.util.Scanner;

public class Height {
    private int inches;
    private int feet;

    public Height (int inches)
    {
    this.inches = inches;
    }
    public Height(int feet, int inches)
    {
    this.inches = inches;
    this.feet = feet;
    }
    public void simplfy()
    {
        int tempInches = inches;
        feet = tempInches/12;
        tempInches = inches;
        inches = tempInches%12;
    }
    public void add(int inches)
    {
        this.inches += inches;
    }
    public  void addHeight(int inches, int feet)
    {
        this.inches = inches;
        this.feet = feet;
        if(this.inches>12)
        {
            simplfy();
        }
    }
    public int getInches()
    {
        return inches;
    }
    public int getFeet()
    {
        return feet;
    }
}

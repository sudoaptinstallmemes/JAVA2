import java.util.Scanner;

public class AUTOMAIN {

    private String carModel;
    private int mileage;

    public void Car()
    {
        carModel = "";
    }
    public void Car(String startCarModel, int startMileage)
    {
        setCarModel(startCarModel);
        setMileage(startMileage);
    }

    public String getCarModel()
    {
        return carModel;
    }

    public int getMileage()
    {
        return mileage;
    }

    public void setCarModel(String newCarModel)
    {
        carModel = newCarModel;

    }

    public void setMileage(int newMileage)
    {
        if (newMileage >= 0)
        {
            mileage = newMileage;
        }
    }

    }

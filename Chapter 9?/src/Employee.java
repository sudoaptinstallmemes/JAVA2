public class Employee {

    private int years;

    public Employee(int amount){
        years = amount;
    }

    public int getYears(){
        return(years);
    }

    public int getHours(){
        return(40);
    }

    public double getSalary(){
        return(50000.0);
    }

    public int getVacationDays(){
        return(10 + getBonus());
    }

    public String getVacationForm(){
        return("yellow");
    }

    public int getBonus(){
        return(2*years);
    }
}
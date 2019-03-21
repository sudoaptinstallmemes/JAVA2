public class Invest_Main {
//72 pg 417
    private double investment;
    private double rate;
    private double years;

    public void INPUT(double tempInvestement, double tempRate, double tempYears)
    {
        setInvestment(tempInvestement);
        setRate(tempRate);
        setYears(tempYears);
    }
    public double getInvestment() {return investment;}
    public double getRate() {return rate;}
    public double getYears() {return years;}

    public void setInvestment(double investment) {
        this.investment = investment;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public void setYears(double years) {
        this.years = years;
    }
}

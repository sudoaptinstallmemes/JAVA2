public class Invest_Client {
    public static void main(String [] args)
    {
        Invest_Main investment = new Invest_Main();

        investment.INPUT(100, 0.1, 2);
         double gain;
         gain = Math.pow(investment.getInvestment() * (1 + investment.getRate()), investment.getYears());
         System.out.println("User invests "+investment.getInvestment()+" dollars for "+investment.getYears()+" at a rate of "+investment.getRate()+".");
         System.out.println("User profits "+gain+" dollars.");
    }
}

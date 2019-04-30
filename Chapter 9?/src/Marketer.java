public class Marketer extends Employee {
    public Marketer(int years){
        super(years);
    }
    @Override
    public double getSalary() {
        return super.getSalary()+10000;
    }
    public void advertise(String product){
        System.out.println("Buy "+product+" today!");
    }
}

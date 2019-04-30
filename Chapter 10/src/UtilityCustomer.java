abstract class UtilityCustomer {

    int accountNumber;

    public abstract double CalculateBill();

    public void setAccountNumber(int newaccountNumber) {
        accountNumber = newaccountNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }
//    public String toString() {//overriding the toString() method
//        return ;
//    }

}

abstract class GasCustomer extends UtilityCustomer{
    int cubicmetersused;
    int pricepercube = 1;

    public void setCubicmetersused(int cubicmetersused) {
        this.cubicmetersused = cubicmetersused;
    }

    public int getCubicmetersused() {
        return cubicmetersused;
    }
}
abstract class ElectricCustomer extends  UtilityCustomer{
    int kWattHourUsed;
    int price1 = 10;
    int price2 = 1000000;

    public void setkWattHourUsed(int kWattHourUsed) {
        this.kWattHourUsed = kWattHourUsed;
    }

    public int getkWattHourUsed() {
        return kWattHourUsed;
    }
}

import java.util.Random;
import java.util.Scanner;

public class BankMain {

    Random randy = new Random();
    Scanner input = new Scanner(System.in);

    /*
    Amon Guinan
    March 2019
    Bank Main
    Stores, generates and retrieves values of a Hypothetical bank account.
     */


    private String AccntNmbr;
    private String Username;
    private String Type;
    private double Balance;

    public void MAIN(String tempAccntNmbr, String tempUsername, String tempType, double tempBalance)
    {
        setAccntNmbr(tempAccntNmbr);
        setUsername(tempUsername);
        setType(tempType);
        setBalance(tempBalance);
    }
    public void gen()
    {

        //Account Number

        int randy_set1 = randy.nextInt(1000);
        int randy_set2 = randy.nextInt(1000);

        String r1 = Integer.toString(randy_set1);
        String r2 = Integer.toString(randy_set2);

        AccntNmbr = r1+r2;

        //Username
        System.out.println("Input a Username:");
        Username = input.nextLine();


        //Type
        System.out.println("Input an account type (Saving or Checking):");
        String tempType = input.nextLine();
        tempType = tempType.toLowerCase();
        System.out.println(tempType);
        switch(tempType){
            case("saving"):
            case("s"):
            case("1"):
                Type = "saving";
                break;

            case("checking"):
            case("c"):
            case("2"):
                Type = "checking";
                break;

            default:
                System.err.println("Unable to create type. Please try again.");
                return;
        }

        //Balance
        System.out.println("Enter Balance:");
        System.out.print("$");
        Balance = input.nextDouble();
        System.out.println();



    }
    public void deposit()
    {
        System.out.println("Deposit or Withdrawl?");
        String action = input.nextLine();
        System.out.println("How much?");
        int wish = input.nextInt();
        action = action.toLowerCase();

//        if(wish<20)
//        {
//            System.out.println("A five dollar charge will be incurred in the case of Withdrawls smaller than 20 dollars.");
//            System.out.println("Are you sure? (y/n)");
//            String response = input.nextLine();
//            response = response.toLowerCase();
//            switch(response)
//            {
//                case("yes"):
//                case("y"):
//                case("1"):
//                    break;
//                case("no"):
//                case("n"):
//                case("2"):
//                    return;
//
//            }
//
//        }


        if((Balance - wish)<200)
        {
            System.out.print("Warning, balances below 200 dollars will be charged a tax of 10 dollars.");
        }
        switch(action)
        {
            case("deposit"):
            case("1"):
            case("d"):
                Balance = Balance + wish;
                break;
            case("withdrawl"):
            case("2"):
            case("w"):
                Balance = Balance - wish;
                if(Balance < 200)
                {
                    Balance = Balance - 10;
                }

            default:
                System.out.println("Could not read input. Please try again.");
                return;
        }
    }


    public String getAccntNmbr() {return AccntNmbr;}
    public String getUsername() {return Username;}
    public String getType() {return Type;}
    public double getBalance() {return Balance;}

    public void setAccntNmbr(String AccntNmbr) { this.AccntNmbr = AccntNmbr; }
    public void setUsername(String Username) { this.Username = Username; }
    public void setType(String Type) { this.Type = Type; }
    public void setBalance(double Balance) { this.Balance = Balance; }


}

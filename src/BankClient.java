import java.util.Scanner;

public class BankClient {
    public static void main(String [] args)
    {
        Scanner scan = new Scanner(System.in);
        int x = 0;

        BankMain bank = new BankMain();
        BankMain bank2 = new BankMain();

        bank.gen();
        System.out.println();
        System.out.println("And now, for the second account:");
        System.out.println();
        bank2.gen();
        do {
            System.out.println("Which account would you like to withdraw/deposit from?");
            System.out.println("1, 2 or type end to stop program.");

            String input = scan.nextLine();
            input = input.toLowerCase();
            switch(input)
            {
                case("1"):
                    bank.deposit();
                case("2"):
                    bank2.deposit();
                case("end"):
                    x = 2;
                    return;
                default:
                    System.out.println("Could not process, please try again.");
                    return;

            }
        }
        while(x < 1);
    }
}

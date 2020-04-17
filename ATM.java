import java.io.Scanner;

class ATM
{
    Scanner kb = new Scanner(System.in);
    CheckingAccount checking = new CheckingAccount();
    SavingsAccount savings = new SavingsAccount();
    int operations = 0;
    String response;
    while (!response.equals("q"))
    {
        System.out.print("Do you want to: (D)eposit, (W)ithdraw, (C)heck Balance, (T)ransfer, (Q)uit? ");
        response = kb.nextLine().toLowerCase();
        switch (response)
        {
            case "d":
            case "w":
                boolean withdrawal = response.equals("w");
                int account = 0
                while (account < 1 || account > 2)
                {
                    System.out.print(withdrawal ? "Withdraw from" : "Deposit to" + ": (1)Checking or (2)Savings? ");
                    account = kb.nextInt();
                }
                int credits = 0
                while (account < 1)
                {
                    System.out.print("How many credits do you want to " + withdrawal ? "withdraw" : "deposit" + "? ");
                    credits = kb.nextInt();
                }
                operations++;
                break;
            case "c":
                checking.check();
                savings.check();
                break;
            case "t":
                break;
        }
    }
}
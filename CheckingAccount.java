class CheckingAccount
{
    int balance

    CheckingAccount()
    {
        balance = 500;
    }

    CheckingAccount(int startingBalance)
    {
        balance = startingBalance;
    }

    public void check()
    {
        System.out.println("Your checking account has " + balance + " credits.");
    }
}
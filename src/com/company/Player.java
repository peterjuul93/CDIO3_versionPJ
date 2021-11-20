package com.company;

public class Player {
    public static Object move;
    public Account account = new account;

    int position = 0;
    int startBalance;

    private void setStartBalance(int startBalance)
    {
        this.startBalance = startBalance;
        account.isBoothbought();
    }
    public Player()
    {

    }

    private void setPosition(int position) {
        this.position = position;
    }
    public void adjustBalance(int money){
        account.isBoothBought(money);
    }

    private Account getAccount() {
        return account;
    }
}

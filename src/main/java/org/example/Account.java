package org.example;

public class Account {
    private String name;
    private static double interestRate = 0.1;
    private  double balance;

    public static double getInterestRate() {
        return interestRate;
    }

    public static void setInterestRate(double interestRate) {
        Account.interestRate = interestRate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

      public Account() {
        this.balance = 300;
        this.name = "Vijaya";
    }

    public Account(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public void addInterest(){
        balance*=(1+getInterestRate());
       // System.out.println("Balance here..."+balance);
    }

    public boolean withdraw(double amount){
        if(amount <= balance) {
            balance = balance - amount;
            setBalance(balance);
            System.out.println("New Balance is:"+balance);
            return true;
        }else{
            System.out.println("You have Insufficient balance."+balance+" You are trying to withdraw: "+amount);
            return false;
        }
      }

    public boolean withdraw() {
        return withdraw(20);
    }

}

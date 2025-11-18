package org.example;

public class TestAccount {
    public static void main(String[] args) {
        Account myAccount = new Account();
        myAccount.setName("John");
        myAccount.setBalance(100.78);

       System.out.println("Account Name:"+myAccount.getName());
       System.out.println("Account Name:"+myAccount.getBalance());
        myAccount.addInterest();
       System.out.println("Balance after interest.."+myAccount.getBalance());

        myAccount.withdraw(50);
        myAccount.withdraw();

    }
}

package org.example;

public class TestAccount2 {
    public static void main(String[] args) {
        Account[] accounts = new Account[5];
        accounts[0] = new Account("Alice", 1000.00);
        accounts[1] = new Account("John", 4000.00);
        accounts[2] = new Account("Micheal", 3000.00);
        accounts[3] = new Account("Alison", 5000.00);
        accounts[4] = new Account("Kate", 4000.00);

        Account.setInterestRate(0.07);

        for(int i=0;i<accounts.length;i++){
            System.out.println("before: "+ accounts[i].getName()+","+accounts[i].getBalance());
            accounts[i].addInterest();
            System.out.println("after: "+accounts[i].getName()+","+accounts[i].getBalance());

        }

        }
}

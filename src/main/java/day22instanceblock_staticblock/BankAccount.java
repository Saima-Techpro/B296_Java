package day22instanceblock_staticblock;

public class BankAccount {

    // order of execution: static block => instance block => constructor

    // instance variables
    public String ownerName;
    public int accountNumb;
    public double balance;

    // static variable

    public static int accountCount = 0; // to count the number of accounts

    // instance block
    {
        this.accountNumb = ++accountCount; // pre-increment => this will assign unique number to every account
        this.balance = 100;
        System.out.println("Instance block is executed here!!");
    }


    // static block
    static {
        accountCount = 1000;
        System.out.println("Static block is executed here!!");
    }

    // constructor
    public BankAccount(String ownerName){
        this.ownerName = ownerName;
        System.out.println("Constructor is executed here!!");
    }


    // Method to display account details
    public void displayAccount(){
        System.out.println("accountNumb = " + accountNumb);
        System.out.println("balance = " + balance);
        System.out.println("ownerName = " + ownerName);
    }


    public static void main(String[] args) {

        BankAccount account1 = new BankAccount("Boukadida");
        account1.displayAccount();

        System.out.println("================");

        BankAccount account2 = new BankAccount("Natalia");
        account2.displayAccount();



    }


}

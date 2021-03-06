package in.conceptarchitect.banking;

public class BankAccount {

    private int accountNumber;
    private String name;
    private double balance;
    private String password;
    private double interestRate;

    public BankAccount(int accountNumber, String name, double balance, String password, double interestRate) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
        this.password = password;
        this.interestRate = interestRate;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean deposit(double amount){
        if(amount>0) {
            balance += amount;
            return true;
        }
        else{
            return false;
        }
    }

    public boolean withdraw(double amount,String password){
        if(amount<0)
            return false;
        if (amount>balance)
            return false;
        if(! this.password.equals(password))
            return false;
        balance-=amount;
        return true;
    }

    public void creditInterest(){
        balance+=(balance*interestRate/1200);
    }


    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public double getInterestRate() {
        return interestRate;
    }


}

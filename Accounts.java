import java.util.Scanner;

class MinBalExp extends Exception{
    
    MinBalExp(String  message){

        super(message);
    }

}

class Bank {
    int balance;

    Bank(int bal) {
        balance = bal;

    }

    // withdraw
    void withdraw(int amt)throws MinBalExp {

       if(balance>=amt){
         balance -= amt;
         viewBalance();
       }else{
        throw new MinBalExp("cannot withdraw the amout graterthan the balance");
       }

    }

    // deposit
    void deposit(int amt) {
        balance += amt;
        viewBalance();

    }

    // balance
    void viewBalance() {
        System.out.println("account balance: "+balance);
        

    }

}


public class Accounts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bank bank = new Bank(100);
         System.out.println("enter the amount you want to deposit");
        int damt = sc.nextInt();
        bank.deposit(damt);

        System.out.println("enter the amount you want to withdraw");
        int wamt = sc.nextInt();

       try {
         bank.withdraw(wamt);

       } catch (MinBalExp e) {
        System.out.println(e);
       }


    }

}
